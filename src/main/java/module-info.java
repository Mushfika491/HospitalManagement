module com.example.hospitalmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hospitalmanagement to javafx.fxml;
    opens com.example.hospitalmanagement.Admin to javafx.fxml , java.base;
    opens com.example.hospitalmanagement.Doctor to javafx.fxml , java.base;
    opens com.example.hospitalmanagement.Patient to javafx.fxml , java.base;
    exports com.example.hospitalmanagement;
}