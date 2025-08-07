package com.example.hospitalmanagement.Patient;

import com.example.hospitalmanagement.User;

import java.time.LocalDate;
import java.util.Random;

public class Patient extends User {
    private int status;
    private String emergencyContact;

    public Patient(String name, String phoneNo, String email, String password, String gender, String address, LocalDate dob, String emergencyContact) {
        super( name, phoneNo, email, password, gender, address, dob);
        this.setId(generateID());
        this.status = 2;
        this.emergencyContact = emergencyContact;
    }

    @Override
    public String generateID() {
        String id = "";

        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000,9999999));
        return id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @Override
    public String toString() {
        return  super.toString() + '\n'  +
                "Status=" + status + '\n'  +
                "EmergencyContact='" + emergencyContact
                ;
    }

    @Override
    public boolean login(String id, String password) {
        return false;
    }
}
