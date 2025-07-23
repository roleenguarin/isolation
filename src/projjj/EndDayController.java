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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class EndDayController implements Initializable {

    @FXML private GridPane EndDayGrdPane1;
    @FXML private Button EndDayNextBtn;
    @FXML private GridPane EndDayGrdPane2;
    @FXML private Label EndDayTitle, EndDayEnergyText, EndDayStressText;
    @FXML private VBox EndDayVBox;
    
    private ImageView EnergyBar, StressBar;
    private int EndDaytoNextCount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML public void EndDaytoNext(ActionEvent event) throws IOException {
        EndDaytoNextCount++;
        switch(EndDaytoNextCount){
            case 1:
                EndDayVBox.getChildren().remove(EndDayGrdPane2);
                EndDayVBox.getChildren().add(EndDayEnergyText);
                EnergyBar = new ImageView();
                EnergyBar.setImage(new Image(getClass().getResourceAsStream("BarSub.png")));
                EndDayVBox.getChildren().add(EnergyBar);
                EndDayVBox.getChildren().add(EndDayStressText);
                StressBar = new ImageView();
                StressBar.setImage(new Image(getClass().getResourceAsStream("BarSub.png")));
                EndDayVBox.getChildren().add(StressBar);
                break;
            case 2:
                //MtoO
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneM.fxml"));
                Parent root = loader.load(); 
                SceneMController sceneMController = (SceneMController) loader.getController();
                sceneMController.MtoO(event); //pero di ba yung popup yung magbabago ng scene with this? kasi baka itong window yung makuha sa method (??)):

                //hide this window
                Stage thisStage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                thisStage1.hide();
                        
        }
    }
    
}
