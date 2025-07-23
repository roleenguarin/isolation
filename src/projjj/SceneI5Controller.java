/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projjj;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneI5Controller implements Initializable {

    @FXML
    private Button subChoice1;
    @FXML
    private Button subChoice2;
    @FXML
    private Button subChoice3;
    @FXML
    private Button subChoice4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Choice1(ActionEvent event) throws IOException {
        //change I text; add buttons; disable/invisible next button
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneI.fxml"));
        Parent root = loader.load();
        SceneIController sceneIController = (SceneIController) loader.getController();
        sceneIController.doUWantSlep();
        //close this window
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
    }

    @FXML
    private void Choice2(ActionEvent event) throws IOException {
        //change I text; add buttons; disable/invisible next button
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneI.fxml"));
        Parent root = loader.load();
        SceneIController sceneIController = (SceneIController) loader.getController();
        sceneIController.doUWantEat();
        //close this window
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
    }

    @FXML
    private void Choice3(ActionEvent event) throws Exception {
        //change south
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneI.fxml"));
        Parent root = loader.load();
        SceneIController sceneIController = (SceneIController) loader.getController();
        sceneIController.taskUlet();
        //open tasklist
        projjj.TaskList taskList1 = new TaskList();
        taskList1.showWindow();
        //theres mor 
        //hide this window
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
    }

    @FXML
    private void Choice4(ActionEvent event) throws IOException {
        //ItoL
        Parent root = FXMLLoader.load(getClass().getResource("SceneL.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
        //close this window
        Stage etongStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        etongStage.hide();
    }
    
}
