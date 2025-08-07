package com.example.hospitalmanagement;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController
{
    @javafx.fxml.FXML
    private TextField userIdTF;
    @javafx.fxml.FXML
    private PasswordField passwordPF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoginButtonOA(ActionEvent actionEvent) {
        String id, password;
        boolean flag = true;
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        id = userIdTF.getText();
        password = passwordPF.getText();

        if (id.isBlank()){
            flag = false;
            errorAlert.setTitle("User ID Error!!!");
            errorAlert.setContentText("User ID can not be blank");
            errorAlert.showAndWait();
        }
        if (password.isBlank()){
            flag = false;
            errorAlert.setTitle("Password Error!!!");
            errorAlert.setContentText("Password can not be blank");
            errorAlert.showAndWait();
        }

        if (flag){
            if (id.length() == 7){
//                login as a patient
            }

            else if (id.length() == 4) {
                //login as a doctor
            }
            else if (id.length() == 5) {
                //login as an admin
            }
            else{
                errorAlert.setTitle("User ID Error!!!");
                errorAlert.setContentText("User ID Type Doesn't Exist");
            }
        }
    }
}