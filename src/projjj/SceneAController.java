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
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Roleen
 */
public class SceneAController implements Initializable {
    
    @FXML
    private GridPane ACtrPane;
    @FXML
    private ImageView ACtrImg;
    @FXML
    private Label ACtrText;
    
    private int AImgCount;
    
    @FXML
    public void AtoNext(MouseEvent event) throws IOException {
        AImgCount++;
        switch(AImgCount){
                case 1:
                    ACtrImg.setImage(new Image(getClass().getResourceAsStream("half.PNG")));
                    ACtrPane.setStyle("-fx-background-color: #979797;");
                    break;
                case 2:
                    ACtrImg.setImage(new Image(getClass().getResourceAsStream("sun.PNG")));
                    ACtrPane.setStyle("-fx-background-color: #ffffff;");
                    ACtrText.setTextFill(Color.BLACK);
                    break;
                case 3:
                    //if scene is O
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneO.fxml"));
                    Parent root = loader.load();
                    SceneOController sceneOController = (SceneOController) loader.getController();
                    if(sceneOController.isThisO() == true){
                        //change text
                        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("SceneB5.fxml"));
                        Parent root2 = loader2.load();
                        SceneB5Controller sceneB5Controller = (SceneB5Controller) loader.getController();
                        sceneB5Controller.tEXT();
                        //change scene
                        Parent root1 = FXMLLoader.load(getClass().getResource("SceneB5.fxml"));
                        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root1);
                        thisStage.setScene(scene);
                        thisStage.show();
                    }
                    else{
                        Parent root2 = FXMLLoader.load(getClass().getResource("SceneB.fxml"));
                        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root2);
                        thisStage.setScene(scene);
                        thisStage.show();
                    }
                    break;
                default:
                    break;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
