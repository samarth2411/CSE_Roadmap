module com.example.cse_roadmap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cse_roadmap to javafx.fxml;
    exports com.example.cse_roadmap;
}