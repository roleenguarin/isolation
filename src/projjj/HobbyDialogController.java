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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class HobbyDialogController implements Initializable {

    @FXML private Label hobbyDlgText;
    @FXML private TextField hobbyDlgTxtFld;
    @FXML private VBox hobbyDlgVBox;
    @FXML private FlowPane hobbyDlgFlwPane1;
    
    private String hobbyName;
    private ImageView Bar;
    private int hobbyDlgtoNextCount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void hobbyDlgtoNext(ActionEvent event) throws IOException {
        hobbyDlgtoNextCount++;
        switch(hobbyDlgtoNextCount){
                case 1:
                    hobbyName = hobbyDlgTxtFld.getText();
                    hobbyDlgFlwPane1.getChildren().remove(hobbyDlgTxtFld);
                    hobbyDlgText.setText("/name/ did " + hobbyName);
                    Bar = new ImageView();
                    Bar.setImage(new Image(getClass().getResourceAsStream("sun.PNG"))); //ala pang image 
                    hobbyDlgVBox.getChildren().add(Bar);
                    break;
                case 2:
                    //if scene is L
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneL.fxml"));
                    Parent root = loader.load();
                    SceneLController sceneLController = (SceneLController) loader.getController();
                    if(sceneLController.isThisL() == true){
                        sceneLController.doUWantSlep();
                        
                        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        thisStage.hide();
                    }
                    else{
                        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        thisStage.hide();
                    }
                    break;
        }
    }
    
}
