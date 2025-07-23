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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneHController implements Initializable {

    @FXML
    private Label HSthText;
    @FXML
    private Button HCtrChoice1;
    @FXML
    private Button HCtrCoice2;
    @FXML
    private Button HCtrChoice3;
    @FXML
    private Button HCtrChoice4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void HSleepDialog(ActionEvent event) throws Exception {
        projjj.messageDialog sleepDlg = new messageDialog();
        sleepDlg.showWindow();
    }

    @FXML
    public void HHobbyDialog(ActionEvent event) throws Exception {
        projjj.hobbyDialog HobbyDlg = new hobbyDialog();
        HobbyDlg.showWindow();
    }

    @FXML
    public void HtoI(ActionEvent event) throws IOException, Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SceneI.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
        
        //tasklist
        projjj.TaskList taskList = new TaskList();
        taskList.showWindow();
    }

    @FXML
    public void HtoJ(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SceneJ.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
}
