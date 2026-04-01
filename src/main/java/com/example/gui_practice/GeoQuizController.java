package com.example.gui_practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GeoQuizController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private AnchorPane[] panels;
    private TextField[] guess;
    private int score = 0, currentIndex = 0;
    private String[] answers = new String[]{"Paris", "Tokyo", "Berlin"};
    private boolean[] answered = new boolean[]{false, false, false};
    @FXML
    public Label scoreLabel;
    @FXML
    public AnchorPane panel1, panel2, panel3, panel4;
    @FXML
    public Button prevButton, nextButton, backToMenuButton;
    @FXML
    public TextField question1TextField, question2TextField, question3TextField;
    @FXML
    public void initialize(){
        panels = new AnchorPane[]{panel1, panel2, panel3, panel4};
        guess = new TextField[]{question1TextField, question2TextField, question3TextField};
        setScore();
        updatePanels();


        prevButton.setVisible(false);
    }
    @FXML
    public void nextPanel(){
        checkAnswer();

        if(currentIndex < panels.length - 1){
            currentIndex++;
            updatePanels();
        }
    }

    @FXML
    public void prevPanel(){
        if(currentIndex > 0){
            currentIndex--;
            updatePanels();
        }
    }

    @FXML
    public void checkAnswer(){
        if(currentIndex >= answers.length || answered[currentIndex])
            return;

        String userAnswer = guess[currentIndex].getText().trim();
        String correctAnswer = answers[currentIndex];

        if(userAnswer.equalsIgnoreCase(correctAnswer)){
            score++;
            setScore();
        }

        answered[currentIndex] = true;
    }

    public void setScore(){
        if(score > 3)
            return;
        scoreLabel.setText("Your Score: " + score + "/3");
    }


    public void updatePanels(){
        for(int i = 0; i < panels.length; i++){
            panels[i].setVisible(i == currentIndex);
        }
        prevButton.setVisible(currentIndex > 0);
        nextButton.setVisible(currentIndex < panels.length - 1);
    }


    public void switchToMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("LA6 GUI Activity");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
