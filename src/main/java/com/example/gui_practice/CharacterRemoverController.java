package com.example.gui_practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterRemoverController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private final String original = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public Label textLabel;
    StringBuilder sb = new StringBuilder(original);

    @FXML
    private CheckBox vowelCheckbox, consonantCheckbox, numberCheckbox;

    public void removeCharacters() {

        if (!vowelCheckbox.isSelected() && !consonantCheckbox.isSelected() && !numberCheckbox.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select an option!");
            alert.showAndWait();
        }

        if (vowelCheckbox.isSelected()) {
            for (int i = 0; i < sb.length(); i++) {
                if (isVowel(sb.charAt(i))) {
                    sb.deleteCharAt(i);
                    }
                }
            }

        if (consonantCheckbox.isSelected()) {
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if (!isVowel(c) && !Character.isDigit(c)) {
                    sb.deleteCharAt(i);
                    i--;
                    }
                }
            }

        if (numberCheckbox.isSelected()) {
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    sb.deleteCharAt(i);
                    i--;
                    }
                }
            }
        textLabel.setText(sb.toString());
    }

    public void restoreCharacters(){
        sb = new StringBuilder(original);
        textLabel.setText(String.valueOf(original));
    }


    public void switchToMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("LA6 GUI Activity");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private boolean isVowel(char c){
        return "AEIOU".indexOf(c) != -1;
    }
}
