package com.example.gui_practice;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class MainController {
    private Stage stage;
    private Scene scene;
    private Parent root;


//    public void switchToPb1(ActionEvent event) throws IOException {
//
//    }

    public void switchToPb1(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("numcount-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb2(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("pizzaorder-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Pizza Order System");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb3(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("charremover-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Character Remover");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb4(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("numcount-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb5(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("numcount-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb6(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("numcount-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb7(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("numcount-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb8(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("numcount-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb9(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("geoquiz-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPb10(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("numcount-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Number Counter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exitProgram(javafx.event.ActionEvent actionEvent) {
        Platform.exit();
    }

}
