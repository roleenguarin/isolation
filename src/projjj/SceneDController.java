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
import static javafx.geometry.Pos.CENTER;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneDController implements Initializable {

    @FXML private ImageView DCtrBgPic;
    @FXML private VBox DSthVBox;
    private Label DSthText2, DSthText3, DSthText4;
    private int DtoNextCount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML public void DtoNext(ActionEvent event) throws IOException {
        DtoNextCount++;
        switch(DtoNextCount){
            case 1:
                DCtrBgPic.setImage(new Image(getClass().getResourceAsStream("mornRtn2smol.png")));
                break;
                
            case 2:
                DCtrBgPic.setImage(new Image(getClass().getResourceAsStream("mornRtn3smol.png")));
                DSthText2 = new Label("- make bed...");
                DSthText2.setAlignment(CENTER);
                DSthText2.setFont(new Font("Bell MT", 14));
                DSthVBox.getChildren().add(DSthText2);
                break;
            case 3:
                DCtrBgPic.setImage(new Image(getClass().getResourceAsStream("mornRtn4smol.png")));
                DSthText2.setText("- make bed...done!");
                break;
            case 4:
                DCtrBgPic.setImage(new Image(getClass().getResourceAsStream("mrnRtn5smol.png")));
                DSthText3 = new Label("- shower...");
                DSthText3.setAlignment(CENTER);
                DSthText3.setFont(new Font("Bell MT", 14));
                DSthVBox.getChildren().add(DSthText3);
                break;
            case 5:
                DCtrBgPic.setImage(new Image(getClass().getResourceAsStream("mrnRtn6smol.png")));
                DSthText3.setText("- shower...done!");
                break;
            case 6:
                DCtrBgPic.setImage(new Image(getClass().getResourceAsStream("mrnRtn7smol.png")));
                DSthText4 = new Label("- wash face...");
                DSthText4.setAlignment(CENTER);
                DSthText4.setFont(new Font("Bell MT", 14));
                DSthVBox.getChildren().add(DSthText4);
                break;
            case 7:
                DCtrBgPic.setImage(new Image(getClass().getResourceAsStream("mrnRtn8smol.png")));
                DSthText4.setText("- wash face and brush teeth...done!");
                break;
            case 8:
                Parent root = FXMLLoader.load(getClass().getResource("SceneG.fxml"));
                Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                Scene scene = new Scene(root);
                thisStage.setScene(scene);
                thisStage.show();
                break;
        }
    }
    
}
