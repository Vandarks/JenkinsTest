module com.example.jenkinstest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jenkinstest to javafx.fxml;
    exports com.example.jenkinstest;
}