package com.example.sw_final;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TenantMainController {

    @FXML
    private Button controlPanelButton;

    @FXML
    private Button advertiseButton;


    @FXML
    private Button viewHousingButton;

    @FXML
    private void initialize() {
        // Set event handlers for the buttons
        controlPanelButton.setOnAction(e -> openScreen("tenantControlPanel.fxml", "Tenant Control Panel"));
        advertiseButton.setOnAction(e -> openScreen("tenantFurniture.fxml", "Advertise Used Furniture"));
        viewHousingButton.setOnAction(e -> openScreen("HouseListView.fxml", "View Available Housing and House Details"));
    }

    private void openScreen(String fxmlFileName, String windowTitle) {
        try {
            refactored(fxmlFileName, windowTitle);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void refactored(String fxmlFileName, String windowTitle) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        Parent myroot = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle(windowTitle);
        stage.setScene(new Scene(myroot));
        stage.show();
    }
}
