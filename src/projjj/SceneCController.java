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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import static javafx.geometry.Pos.CENTER;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneCController implements Initializable {
    
    @FXML private Label CCtrText1;
    @FXML private Button CCtrChoice1, CCtrChoice2, CCtrNextBtn, CCtrChoice4;
    @FXML private FlowPane CCtrFlwPane, CCtrFlwPane2;
    @FXML private VBox CCtrVBox;
    
    private Label CCtrText2;
    private Button CCtrChoice3;
    private HBox CCtrHBox;
    
    EventHandler<ActionEvent> CtoE = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent ev) {
            //C to E (di na gagawin screenE)
        }
    };
    
    //choice1: sleep again
    @FXML public void CChoice1(ActionEvent event) throws IOException{
        // !!!! sleep !!!!
        //Student.getTheStudent().sleep(); //student does sleep
        
        //change Text1
        CCtrText1.setText("/name/ slept for"); //student's name
        
        //remove buttons; add Text2
        CCtrFlwPane.getChildren().remove(CCtrChoice1);//di to gumagana vvv
        CCtrChoice1.setDisable(false);
        CCtrFlwPane.getChildren().remove(CCtrChoice2);//eto ren
        CCtrChoice2.setDisable(false);
        CCtrText2 = new Label("/oversleep/ more"); //student oversleep
        CCtrText2.setFont(new Font("Bell MT", 14));
        CCtrFlwPane.getChildren().add(CCtrText2);
        
        //add NextBtn
        CCtrNextBtn.setVisible(true);
        CCtrNextBtn.setDisable(false);
    }
    
    //choice2: wake up
    @FXML public void CChoice2(ActionEvent event) throws IOException{
        //remove text1 and next button
        CCtrVBox.getChildren().remove(CCtrText1);
        CCtrNextBtn.setVisible(false);
        CCtrNextBtn.setDisable(true);
        
        //remove text2; add buttons
        CCtrFlwPane2.getChildren().remove(CCtrChoice4);
        CCtrHBox = new HBox();
        CCtrHBox.setSpacing(24);
        CCtrHBox.setAlignment(CENTER);
        CCtrChoice3 = new Button("go through your phone");
        CCtrChoice3.setOnAction(CtoE);
        CCtrChoice3.setStyle("-fx-background-color: black; -fx-text-fill: white");
        CCtrChoice3.setFont(new Font("Bell MT", 14));
        CCtrChoice3.wrapTextProperty().setValue(true);
        CCtrChoice3.setMaxWidth(86);
        CCtrChoice3.setMinHeight(50);
        CCtrChoice3.setAlignment(CENTER);       
        CCtrFlwPane.getChildren().remove(CCtrText2);
        CCtrFlwPane.getChildren().remove(CCtrChoice1);
        CCtrChoice1.setDisable(false);
        CCtrFlwPane.getChildren().remove(CCtrChoice2);
        CCtrChoice2.setDisable(false);
        
        CCtrFlwPane.getChildren().add(CCtrHBox);
        CCtrHBox.getChildren().add(CCtrChoice3);
        CCtrHBox.getChildren().add(CCtrChoice4);
        
        CCtrChoice4.setVisible(true);
        CCtrChoice4.setDisable(false);
    }
    
    @FXML public void CtoD(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneD.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow(); //ghorl
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
