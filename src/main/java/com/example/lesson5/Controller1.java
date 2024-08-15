package com.example.lesson5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;


class find
{
    HashMap<String,String> loginInfo = new HashMap<>();

   find()
    {
        loginInfo.put("DOO","pass");
        loginInfo.put("Ching","Choon");
        loginInfo.put("lol","lmao");


    }
    boolean check(String username,String password)
    {

        if (loginInfo.containsKey(username)) {
            return loginInfo.get(username).equals(password);
        }
        else {
            return false;
        }
    }


}





public class Controller1
{
    @FXML

    Stage stage;
    Parent root;
  public   TextField username;
  public   TextField password;






    @FXML
    public  void  login(ActionEvent event) throws IOException
    {
        String UserName=username.getText();
        String PassWord=password.getText();
        find fd=new find();


        if(fd.check(UserName,PassWord)) {


            FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));

            root = loader.load();


            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            controller2 controller = loader.getController();
            controller.display(UserName);
            stage.show();
        }else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Wrong Username or Password");
            alert.show();
        }
    }





}
