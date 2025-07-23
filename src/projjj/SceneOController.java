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
import static javafx.geometry.Pos.BOTTOM_CENTER;
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
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneOController implements Initializable {

    @FXML
    private GridPane OCtrGrdPane;
    @FXML
    private ImageView OCtrImg;
    @FXML
    private Label OCtrText;
    
    private int OImgCount;
    private Label Goodnight;
    private boolean isThisO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML public void OtoNext(MouseEvent event) throws IOException {
        OImgCount++;
        switch(OImgCount){
                case 1:
                    OCtrImg.setImage(new Image(getClass().getResourceAsStream("half.PNG")));
                    OCtrGrdPane.setStyle("-fx-background-color: #979797;");
                    OCtrText.setTextFill(Color.WHITE);
                    break;
                case 2:
                    OCtrImg.setImage(new Image(getClass().getResourceAsStream("moon.PNG")));
                    OCtrGrdPane.setStyle("-fx-background-color: black;");
                    Goodnight = new Label("goodnight1");
                    OCtrGrdPane.add(Goodnight, 0, 0);
                    Goodnight.setAlignment(BOTTOM_CENTER);
                    break;
                case 3:
                    isThisO = true;
                    Parent root = FXMLLoader.load(getClass().getResource("SceneA.fxml"));
                    Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    thisStage.setScene(scene);
                    thisStage.show();
                    break;
                default:
                    break;
    }
    
}
    
    public boolean isThisO(){
        return isThisO;
    }
}
