package com.example.assignment3;

import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class HelloController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    private Label welcomeText;


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Window owner = submitButton.getScene().getWindow();

        if(emailField.getText().isEmpty()) {
            makeAlert.alertMaker(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your Email");
            return;
        }
        if(passwordField.getText().isEmpty()) {
            makeAlert.alertMaker(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your Password");
            return;
        }

        String emailData = emailField.getText();
        String passwordData = passwordField.getText();

        if( SecurityCheck.checkEmail(emailData) == false) {
            makeAlert.alertMaker(Alert.AlertType.ERROR, owner, "Form Error!", "Invalid Email");
            return;
        }
        if( SecurityCheck.checkPassword(passwordData) == false) {
            makeAlert.alertMaker(Alert.AlertType.ERROR, owner, "Form Error!", "Invalid Password");
            return;
        }

        makeAlert.alertMaker(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome ");

    }
}