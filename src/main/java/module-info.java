module com.example.sakancom_se_2023_v4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sakancom_se_2023_v4 to javafx.fxml;
    exports com.example.sakancom_se_2023_v4;
}