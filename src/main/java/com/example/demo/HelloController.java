package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Button button;

    @FXML
    private TextArea chatArea;

    @FXML
    private TextField textField;

    @FXML
    private TableColumn<?, ?> user;

    @FXML
    void users() {
        String space = System.lineSeparator();
        String users = "User 1" + space + "User 2" + space + "User 3";
        user.setText(users);
    }

    @FXML
    void pushMessage(ActionEvent event) {
        users(); //как сделать, чтобы users показывались до нажатия кнопки push?
        String message = textField.getText().trim();
        String chat = chatArea.getText();
        String space = System.lineSeparator();
        String all = message + space + chat;

        if (message.length() != 0) {
            chatArea.setText(all);
            String empty = " ";
            textField.setText(empty);
        }
    }

}

