package com.example.demo3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField int1;

    @FXML
    private TextField int2;

    @FXML
    private TextField otvet;

    @FXML
    void deli(ActionEvent event) {
        int a = Integer.parseInt(int1.getText());
        int b = Integer.parseInt(int2.getText());
        int c = 0;
        c = a / b;
        otvet.setText(Integer.toString(c));
    }

    @FXML
    void minus(ActionEvent event) {
        int a = Integer.parseInt(int1.getText());
        int b = Integer.parseInt(int2.getText());
        int c = 0;
        c = a - b;
        otvet.setText(Integer.toString(c));
    }

    @FXML
    void plus(ActionEvent event) {
        int a = Integer.parseInt(int1.getText());
        int b = Integer.parseInt(int2.getText());
        int c = 0;
        c = a + b;
        otvet.setText(Integer.toString(c));

    }

    @FXML
    void unm(ActionEvent event) {
        int a = Integer.parseInt(int1.getText());
        int b = Integer.parseInt(int2.getText());
        int c = 0;
        c = a * b;
        otvet.setText(Integer.toString(c));
    }

    @FXML
    void initialize() {
        assert int1 != null : "fx:id=\"int1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert int2 != null : "fx:id=\"int2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
