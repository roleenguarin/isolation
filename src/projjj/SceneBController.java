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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneBController implements Initializable {
    
    private Label BCtrText2;
    private TextField BCtrTxtFld;
    private FlowPane BCtrFlwPane1;
    
    private int BNxtCount;
    @FXML
    private BorderPane B5BrdrPane;
    @FXML
    private Pane B5NrtPane;
    @FXML
    private Pane B5WstPane;
    @FXML
    private Pane B5SthPane;
    @FXML
    private VBox B5CtrPane;
    @FXML
    private Label B5CtrText1;
    @FXML
    private Label B5CtrText2;
    @FXML
    private FlowPane B5CtrFlwPane1;
    @FXML
    private FlowPane B5CtrFlwPane2;
    @FXML
    private Button B5CtrNextBtn;
    @FXML
    private Pane B5EstPane;

    public void BtoNext(ActionEvent event) throws IOException {
        BNxtCount++;
        switch(BNxtCount){
            case 1:
                //change contents
                BCtrText2.setText("Good morning, " + BCtrTxtFld.getText()+ ".");
                BCtrFlwPane1.getChildren().remove(BCtrTxtFld);
                break;
            case 2:
                //change scene
                Parent root = FXMLLoader.load(getClass().getResource("SceneC.fxml"));
                Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                thisStage.setScene(scene);
                thisStage.show();
                break;
            default:
                break;
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void B5toNext(ActionEvent event) {
    }

}
