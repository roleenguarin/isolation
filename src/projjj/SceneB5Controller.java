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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneB5Controller implements Initializable {
    
    @FXML private Label B5CtrText2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML public void B5toNext(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SceneC.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    public void tEXT(){
        B5CtrText2.setText("Good morning, you." /*+ student name*/); //student name
    }
    
}
