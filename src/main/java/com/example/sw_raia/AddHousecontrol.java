package com.example.sw_raia;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.logging.Logger;
public class AddHousecontrol {
    static Logger logger = Logger.getLogger(AddHousecontrol.class.getName());

    @FXML
    private Button add;

    @FXML
    void insert(MouseEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Parent myroot=(Parent)fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("houses!");
            stage.setScene(new Scene(myroot));
            stage.show();

        }
        catch (IOException e) {
            logger.log(null, "An error occurred while opening a new window:");
        }
    }

}
