/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rishabhkaushick
 */
public class PrimaryFXMLController implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    TextField nameTextField;
    
//    @FXML
//    TextField nameTextField2;
    
    public void submit(){
        String name = nameTextField.getText();
        System.out.println("Thanks for submitting "+name);
        
        // Alert
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Success");
        userAlert.setHeaderText("Thanks for submitting");
        userAlert.setContentText(name);
        userAlert.showAndWait();
    }
    
}
