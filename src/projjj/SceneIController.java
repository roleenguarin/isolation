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
import javafx.geometry.Insets;
import static javafx.geometry.Pos.CENTER;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Roleen
 */
public class SceneIController implements Initializable {

    @FXML private  Button ISthNextBtn;
    @FXML private  Label ISthText1;
    @FXML private  VBox ISthVBox;
    
    private  ImageView Bar;
    private int ItoNextCount;
    private  Button sleepYes, sleepNo, eatYes, eatNo;
    private FlowPane ISthFlwPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    /* dito bebe
    public void askIfTime11(){
        if (time<11pm){ //not yet 11pm
           //ItoL
        }
        if else (time<=11pm){ //11pm or later
            //do u want 2 sleep quesh
        }
    }
    
    public void askIfStress90(){
        if (student.getStress()<90){ //di pa 90
            //TaskList ulet
            //shows how pag sobrang stressed na u could start, or at least the charac here starts, to bo not so logical and not take care of urself when ure too tired wo GHDFGD
        }
        else if (student.getStress()>=90){ //90 or mor sadt b:((
            //do u want too slep
            //if no, ItoL
            //if yes, ItoM
        }
    }
    
    public static void askIfStress80(){
        //if less than 80, //ask if time
        //if >=80, //ask if stress 90
    }
    
    public static void TasksOrMeals(String answer){
        if (answer.equals("tasks")){ //tasks
            if (student.getTaskCount>0){
                //ask if stress 80
            }
            else if (student.getTaskCount==0){
                //ask if time
            }
        }
        else if (answer.equals("meals")){ //meals
            if (student.getHaveEatenCount()<3){ //di pa 3 meals, u shud eat
                //do u want to eat quesh
                //if no,
            }
            else if (student.getHaveEatenCount()==3){ //3 meals! good bb
                //TasksOrMeals("tasks");
            }
        }
    }
    
    public static void askIfHungry(){
        if (student.getHunger()<60){
            //TasksOrMeals("tasks");
        }
        else if (student.getHunger()>60){
            //TasksOrMeals("meals");
        }
    }
    
    public static void askIfStress60(){
        if (student.getStress()<60){
            //ask if hungry
        }
        else if (student.getStress()>60){ //stressed
            //TasksOrMeals("tasks");
        }
    }
    */
    
    @FXML public void ItoNext(ActionEvent event) throws Exception {
        ItoNextCount++;
        switch(ItoNextCount){
            case 1:
                Bar.setImage(new Image(getClass().getResourceAsStream("BarSub.png"))); //ala pang image
                break;
            case 2:
                ISthText1.setText("/task/ done!");
                Bar.setImage(new Image(getClass().getResourceAsStream("BarSub.png"))); //ala pang image
                break;
            case 3:
                //ask if stress 60
                //open substitute window
                projjj.SubSceneI5 SubScene = new SubSceneI5();
                SubScene.showWindow();
                break;
        }
    }
    
    @FXML public void taskSelected(){
        ISthNextBtn.setVisible(true);
        ISthNextBtn.setDisable(false);
        ISthText1.setText("task...");
        Bar = new ImageView();
        Bar.setImage(new Image(getClass().getResourceAsStream("BarSub.png")));
        ISthVBox.getChildren().add(Bar);
    }
    
    public void doUWantSlep(){
        ISthText1.setText("do you want to sleep?");
        sleepYes = new Button("yes");
        sleepNo = new Button("no");
        sleepYes.setStyle("-fx-background-color: black; -fx-text-fill: WHITE");
        sleepNo.setStyle("-fx-background-color: black; -fx-text-fill: WHITE");
        sleepYes.setFont(new Font("Bell MT", 14));
        sleepNo.setFont(new Font("Bell MT", 14));
        sleepNo.setFont(new Font("Bell MT", 14));
        ISthFlwPane = new FlowPane();
        ISthFlwPane.setAlignment(CENTER);
        ISthVBox.getChildren().add(ISthFlwPane);
        ISthFlwPane.getChildren().add(sleepYes);
        ISthFlwPane.getChildren().add(sleepNo);
        ISthFlwPane.setHgap(14);
    }
    
    public void doUWantEat(){
        ISthText1.setText("do you want to eat?");
        eatYes = new Button("yes");
        eatNo = new Button("no");
        eatYes.setStyle("-fx-background-color: black; -fx-text-fill: WHITE");
        eatNo.setStyle("-fx-background-color: black; -fx-text-fill: WHITE");
        eatYes.setFont(new Font("Bell MT", 14));
        eatNo.setFont(new Font("Bell MT", 14));
        eatNo.setFont(new Font("Bell MT", 14));
        ISthFlwPane = new FlowPane();
        ISthFlwPane.setAlignment(CENTER);
        ISthVBox.getChildren().add(ISthFlwPane);
        ISthFlwPane.getChildren().add(eatYes);
        ISthFlwPane.getChildren().add(eatNo);
        ISthFlwPane.setHgap(14);
    }
    
    public void taskUlet(){
        ISthVBox.getChildren().clear();
        ISthText1.setText("click on a task to work on it.");
        ISthVBox.getChildren().add(ISthText1);
        ISthNextBtn.setDisable(true);
        ISthNextBtn.setVisible(false);
        //ibalik yung mga nagbago the last time na nagtask //loka haba pang additional neto
    }
    
    public void ItoM(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneM.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    public void ItoL(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneL.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    public void ItoK(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SceneK.fxml"));
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
}
