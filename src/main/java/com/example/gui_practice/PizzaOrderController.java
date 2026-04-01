package com.example.gui_practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaOrderController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private int price = 0;
    private int totalPrice = 0;
    public Label totalLabel;
    @FXML
    private ChoiceBox<String> pizzaSizeChoice, pizzaToppingsChoice, extraCheeseChoice;
    @FXML
    public void initialize(){
        pizzaSizeChoice.getItems().addAll("Small", "Medium", "Large");
        pizzaToppingsChoice.getItems().addAll("Mushrooms", "Pepperoni", "Onions");
        extraCheeseChoice.getItems().addAll("Yes", "No");
    }

    public void calculateTotal() throws IOException{
        String op;
        try {
            op = pizzaSizeChoice.getValue();
            int x, y, z;
            switch (op) {
                case "Small":
                    x = 10;
                    break;
                case "Medium":
                    x = 15;
                    break;
                case "Large":
                    x = 20;
                    break;
                default:
                    x = 0;
                    break;
            }


            op = pizzaToppingsChoice.getValue();
            switch (op) {
                case "Mushrooms":
                    y = 2;
                    break;
                case "Pepperoni":
                    y = 2;
                    break;
                case "Onions":
                    y = 2;
                    break;
                default:
                    y = 0;
                    break;
            }

            op = extraCheeseChoice.getValue();
            switch (op) {
                case "Yes":
                    z = 3;
                    break;
                default:
                    z = 0;
                    break;
            }
            totalPrice = x + y + z;
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("The pizza is aggressive");
            alert.setHeaderText(null);
            alert.setContentText("All fields must be filled");
            alert.showAndWait();
        }
//        if(flag.equals("empty")){
//
//            return;
//        }


        totalLabel.setText(String.valueOf(totalPrice));

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
