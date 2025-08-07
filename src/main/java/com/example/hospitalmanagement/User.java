package com.example.hospitalmanagement;

import java.time.LocalDate;

public abstract class User {
    private String id, name, email, phoneNo, password, gender, address;
    private LocalDate dob, doj;

    public User(String name, String phoneNo, String email, String password, String gender, String address, LocalDate dob) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.doj = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return
                "Id='" + id + '\n' +
                "Name='" + name + '\n'  +
                "Email='" + email + '\n'  +
                "PhoneNo='" + phoneNo + '\n'  +
                "Password='" + password + '\n'  +
                "Gender='" + gender + '\n' +
                "Address='" + address + '\n'  +
                "Date of Birth=" + dob + '\n'  +
                "Date of Joining=" + doj
                ;
    }
    public abstract String generateID();
    public abstract boolean login(String id, String password);
}
