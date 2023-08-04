package com.example.sw_raia;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static com.example.sw_raia.AddHousecontrol.logger;

public class logincontrol1 {
    public  static int typeuser=0;

    @FXML
    private RadioButton adminRadio;

    @FXML
    private Button loginbutton;

    @FXML
    private RadioButton ownerRadio;

    @FXML
    private PasswordField password;

    @FXML
    private RadioButton tenantRadio;

    @FXML
    private Label type;

    @FXML
    private ToggleGroup user;

    @FXML
    private TextField username;

    @FXML
    void getusertype(MouseEvent event) {

    }

    @FXML
    void loginbutton(MouseEvent event) {
        try {
            if (adminRadio.isSelected()) {
                if (TESTLOGIN.userNametest(username.getText()) && TESTLOGIN.passWordtest(password.getText())) {
                    typeuser=1;
                    NextPage.make("adminpage.fxml","Admin Page");
                }

            } else if (ownerRadio.isSelected()) {
                if (TESTLOGIN.userNametest(username.getText()) && TESTLOGIN.passWordtest(password.getText())) {
                    typeuser=2;
                    NextPage.make("insert.fxml","houses");

                }
            }
            else if (tenantRadio.isSelected()) {
                if (TESTLOGIN.userNametest(username.getText()) && TESTLOGIN.passWordtest(password.getText())) {
                    typeuser=3;
                    NextPage.make("Tenant.fxml","Tenant Page");

                }



            } else {
                JOptionPane.showMessageDialog(null, "Unvalied ", "Please select one of radio button", JOptionPane.ERROR_MESSAGE);

            }


        } catch (IOException e) {
            logger.log(null, "An error occurred while opening a new window:");
        }
    }
}