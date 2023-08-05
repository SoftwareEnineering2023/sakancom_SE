package com.example.sw_raia;

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
    private Button housingResidentsButton;

    @FXML
    private Button bookAccommodationButton;

    @FXML
    private Button viewHousingButton;

    @FXML
    private void initialize() {
        // Set event handlers for the buttons
        controlPanelButton.setOnAction(e -> openScreen("tenantControlPanel.fxml", "Tenant Control Panel"));
        advertiseButton.setOnAction(e -> openScreen("tenantFurniture.fxml", "Advertise Used Furniture"));
        housingResidentsButton.setOnAction(e -> openScreen("tenantStudent.fxml", "View Housing Residents Information"));
        bookAccommodationButton.setOnAction(e -> openScreen("tenantBook.fxml", "Book Accommodation"));
        viewHousingButton.setOnAction(e -> openScreen("tenantView.fxml", "View Available Housing and House Details"));
    }

    private void openScreen(String fxmlFileName, String windowTitle) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Stage stage = new Stage();
            stage.setTitle(windowTitle);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
