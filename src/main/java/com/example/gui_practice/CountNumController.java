package com.example.gui_practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CountNumController {
    public Label countLabel;
    private int stored = 0;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void increaseNum(ActionEvent event) {
//        Button btn = (Button) event.getSource();
        stored++;
        countLabel.setText(String.valueOf(stored));
    }

    public void decreaseNum(ActionEvent event) {
        stored--;
        countLabel.setText(String.valueOf(stored));
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
