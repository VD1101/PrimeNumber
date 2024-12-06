package com.javaassignment.finalfinal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField inputField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button submitButton;

    @FXML
    protected void onSubmitButtonClick() {
        String input = inputField.getText();

        try {
            int number = Integer.parseInt(input);
            boolean isPrime = Model.isPrime(number);
            if (isPrime) {
                resultLabel.setText(number + " is a Prime Number.");
            } else {
                resultLabel.setText(number + " is NOT a Prime Number.");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid integer.");
        }
    }
}
