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
public class SceneKController implements Initializable {

    @FXML private VBox KSthVBox;
    @FXML private Label KSthText;
    
    private Button KSthYes, KSthNo;
    private FlowPane KSthFlwPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML public void doUWantSlep(){
        KSthText.setText("do you want to sleep?");
        KSthYes = new Button("yes");
        KSthNo = new Button("No");
        KSthFlwPane = new FlowPane();
        KSthFlwPane.setHgap(14);
        KSthFlwPane.getChildren().add(KSthYes);
        KSthFlwPane.getChildren().add(KSthNo);
        KSthVBox.getChildren().add(KSthFlwPane);
    }
    
    public void KtoI(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneI.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    public void KtoL(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneL.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    public void KtoH(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneH.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
}
