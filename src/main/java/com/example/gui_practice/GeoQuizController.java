package com.example.gui_practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GeoQuizController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private AnchorPane[] panels;
    @FXML
    public AnchorPane panel1, panel2;
    @FXML
    public Button prevButton;
    @FXML
    public void initialize(){
        panels = new AnchorPane[]{panel1, panel2};

        for(int i = 0; i < panels.length; i++){
            panels[i].setVisible(i == 0);
        }

        prevButton.setVisible(false);
    }

    @FXML
    public void goToPanel2() {
        panel2.setVisible(true);
        panel1.setVisible(false);
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
