package com.example.lesson5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;



public class controller2 {

    @FXML

    private Stage stage;
    @FXML
   private Label userPassword;



    @FXML
  void logout(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("logout");
        alert.setContentText("Are you sure you want to logout?");
      if(alert.showAndWait().get()==ButtonType.OK) {

          stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
          stage.close();
      }



    }




    void display(String username) {
        userPassword.setText("Welcome " +username+"!!");
    }

}
