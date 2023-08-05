
package com.example.sw_raia;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.input.MouseEvent;
        import javafx.stage.Stage;
        import java.io.IOException;
        import java.util.logging.Logger;
public  class welcomecontrol {
    static Logger logger = Logger.getLogger(AddHousecontrol.class.getName());

    public static  boolean flag=false;
    @FXML
    private Button login1;

    @FXML
    void loginclick(MouseEvent event) {
flag=true;
        try {
            NextPage.make("loginpage1.fxml","login page");

        }
        catch (IOException e) {
            logger.log(null, "An error occurred while opening a new window:");
        }
    }

}

