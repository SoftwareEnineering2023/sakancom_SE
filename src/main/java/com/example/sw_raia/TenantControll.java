package com.example.sw_raia;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

import static com.example.sw_raia.NextPage.make;

public class TenantControll {

    @FXML
    private Button view;

    @FXML
    void viewhouseclick(MouseEvent event) {
        try {
            NextPage.make("HouseListView.fxml","HousesList");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
