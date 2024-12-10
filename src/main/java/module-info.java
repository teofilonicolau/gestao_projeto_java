module com.example.gestaoprojetos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestaoprojetos to javafx.fxml;
    exports com.example.gestaoprojetos;
}