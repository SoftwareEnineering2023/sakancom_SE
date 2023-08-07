package com.example.sw_final;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Testcon {

    @FXML
    private VBox houseContainer;


    private void populateHouses() {
        houseContainer.getChildren().clear();

        for (AdminRequist r : Sakanat.request) {
            VBox houseBox = new VBox();
            houseBox.setSpacing(5);


            Label houseNumberLabel = new Label("House Number: " + r.getHouseNum());
            Label locationLabel = new Label("Location: " + r.getUsername());
            JOptionPane.showMessageDialog(null,"House Number: " + r.getHouseNum());
            JOptionPane.showMessageDialog(null,"Location: " + r.getUsername());
            houseBox.getChildren().addAll(
                     houseNumberLabel, locationLabel
            );

            houseContainer.getChildren().add(houseBox);

            // here i want to put a button action event for each button

        }
    }
}
