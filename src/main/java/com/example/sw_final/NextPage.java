package com.example.sw_final;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NextPage {
    private NextPage()
    {

    }

    public static void make(String x,String y) throws IOException {
        TenantMainController.refactored(x, y);
    }
}
