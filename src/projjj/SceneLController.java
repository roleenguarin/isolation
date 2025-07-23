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
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneLController implements Initializable {

    @FXML
    private VBox LSthVBox;
    @FXML
    private Label LSthText1;
    @FXML
    private Button LCtrChoice1;
    @FXML
    private Button LCtrChoice2;
    
    private boolean isThisL = false;
    private FlowPane LSthFlwPane;
    private Button sleepYes, sleepNo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML public void LDoHobby(ActionEvent event) throws Exception {
        //open window
        projjj.hobbyDialog HobbyDlg = new hobbyDialog();
        HobbyDlg.showWindow();
        //change text
        LSthText1.setText("...");
        LCtrChoice1.setDisable(true);
        LCtrChoice2.setDisable(true);
        //this window
        isThisL = true;
    }

    @FXML public void LtoN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SceneN.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    public boolean isThisL(){
        return isThisL;
    }
    
    public void doUWantSlep(){
        //change text
        LSthText1.setText("do you want to sleep?");
        //add flowpane; add buttons
        LSthFlwPane = new FlowPane();
        LSthFlwPane.setHgap(14);
        sleepYes = new Button();
        sleepYes.setText("yes");
        sleepNo = new Button();
        sleepNo.setText("no");
        LSthFlwPane.getChildren().add(sleepYes);
        LSthFlwPane.getChildren().add(sleepNo);
        LSthVBox.getChildren().add(LSthFlwPane);
    }
    
    public void LtoM(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneM.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    public void LAgain(){
        LSthVBox.getChildren().clear();
        LSthText1.setText("click on a button to choose action.");
        LSthVBox.getChildren().add(LSthText1);
        LCtrChoice1.setDisable(false);
        LCtrChoice2.setDisable(false);
        LSthFlwPane.setHgap(0);
        LSthFlwPane.getChildren().clear();
        sleepYes = new Button();
        sleepYes.setText("um");
        sleepNo = new Button();
        sleepNo.setText("um");
        isThisL = false;
        //mayb theres more??
    }
    
}
