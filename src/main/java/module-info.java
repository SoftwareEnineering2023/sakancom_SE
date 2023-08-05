module com.example.sw_raia {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires AnimateFX;


    opens com.example.sw_raia to javafx.fxml;
    exports com.example.sw_raia;
}