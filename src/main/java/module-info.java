module com.example._365programmingassignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._365programmingassignment1 to javafx.fxml;
    exports com.example._365programmingassignment1;
}