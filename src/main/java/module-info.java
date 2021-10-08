module com.example.pr4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr4 to javafx.fxml;
    exports com.example.pr4;
}