/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projjj;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class TaskListController implements Initializable {

    @FXML private VBox TaskListVBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    //method pag nagtask
    @FXML public void doTask(MouseEvent event) throws IOException{
        //remove task from tasklist
        //Task.getTaskList().remove(this);
        
        //close tasklist
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
        
        //change text; enable button //doesnt happen
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneI.fxml"));
            Parent root = loader.load();
            SceneIController sceneIController = (SceneIController) loader.getController();
            sceneIController.taskSelected(); //di gumagana ???
    }
    
}
