package com.example.lesson5;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        });







        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    void logout(Stage st )
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("logout");
        alert.setContentText("Are you sure you want to logout?");
        if(alert.showAndWait().get()== ButtonType.OK) {


            st.close();
        }



    }
}