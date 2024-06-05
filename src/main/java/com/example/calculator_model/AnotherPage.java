package com.example.calculator_model;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class AnotherPage {

    @FXML
    void clickGoBack(ActionEvent event) throws IOException {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent homeParent = fxml.load();
        Scene homeScene = new Scene(homeParent);
        Stage homeStage = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();
        homeStage.setScene(homeScene);

    }

}
