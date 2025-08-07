package com.example.hospitalmanagement;

import com.example.hospitalmanagement.Patient.Patient;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CreateAccountPageController
{
    @javafx.fxml.FXML
    private TextArea outputTA;
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private RadioButton othersRB;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private ToggleGroup tg;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private TextField phoneNoTF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private RadioButton femaleRB;
    @javafx.fxml.FXML
    private TextField emcontactTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountOA(ActionEvent actionEvent) {
        String name, phoneNo, email, address, gender = "", emergencyCont, password;
        LocalDate dob;

        name = nameTF.getText();
        phoneNo = phoneNoTF.getText();
        email = emailTF.getText();
        address = addressTA.getText();
        emergencyCont = emcontactTF.getText();
        password = passwordPF.getText();
        dob = dobDP.getValue();
        if (maleRB.isSelected()){
            gender = "Male";
        }
        else if (femaleRB.isSelected()) {
            gender = "Female";
        }
        else if (othersRB.isSelected()){
            gender = "Other";
        }

        Patient patient = new Patient(name, phoneNo, email,  password,  gender,  address,  dob,  emergencyCont);
        outputTA.clear();
        outputTA.setText(patient.toString());

        nameTF.clear();
        phoneNoTF.clear();
        emailTF.clear();
        addressTA.clear();
        emcontactTF.clear();
        passwordPF.clear();
        dobDP.setDayCellFactory(null);
        tg.selectToggle(null);
    }
}