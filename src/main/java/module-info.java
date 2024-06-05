module com.example.calculator_model {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator_model to javafx.fxml;
    exports com.example.calculator_model;
}