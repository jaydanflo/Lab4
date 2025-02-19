module com.example.loginassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginassignment to javafx.fxml;
    exports com.example.loginassignment;
}