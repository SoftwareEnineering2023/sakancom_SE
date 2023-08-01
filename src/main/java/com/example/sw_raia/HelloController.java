package com.example.sw_raia;
import javafx.event.ActionEvent;
import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class HelloController {
    String s1="Unvalied number";
    private List<HouseClass> house1 = new ArrayList<>();
    String temp;
    private String errorMassage="errorMassage";

    @FXML
    private Button add2;

    @FXML
    private TextField balcony2;

    @FXML
    private TextField bathroom2;

    @FXML
    private TextField bedroom2;

    @FXML
    private ImageView housePicture2;

    @FXML
    private Button importPicture2;

    @FXML
    private TextField location2;

    @FXML
    private TextField numberHouse2;

    @FXML
    private TextField price2;

    @FXML
    private TextField services2;

    @FXML
    private Label welcomeText;

    @FXML
    void importpictureclicked(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        Stage stage=(Stage) importPicture2.getScene().getWindow();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
        File file=fileChooser.showOpenDialog(stage);

        if (file != null) {
            String iconimagepath = file.getAbsolutePath();
            housePicture2.setImage(new Image(iconimagepath));
            temp=iconimagepath;
        }
        else if(!TESTINPUT.housePictureTest(temp)) JOptionPane.showMessageDialog(null,"Unvalied Picture",errorMassage,JOptionPane.ERROR_MESSAGE);
    }



    @FXML
    void savedhouse(ActionEvent event) {
        if(location2.getText().isEmpty() || price2.getText().isEmpty() || services2.getText().isEmpty() || bedroom2.getText().isEmpty()
                || bathroom2.getText().isEmpty()|| balcony2.getText().isEmpty()|| numberHouse2.getText().isEmpty())
            JOptionPane.showMessageDialog(null,"Please Fill the Data First !",errorMassage,JOptionPane.ERROR_MESSAGE);
        else if(!TESTINPUT.priceTest(price2.getText())) JOptionPane.showMessageDialog(null,"Unvalied price",errorMassage,JOptionPane.ERROR_MESSAGE);
        else if(!TESTINPUT.houseBathroomTest(bathroom2.getText())) JOptionPane.showMessageDialog(null,s1,errorMassage,JOptionPane.ERROR_MESSAGE);
        else if(!TESTINPUT.houseBalconyTest(balcony2.getText())) JOptionPane.showMessageDialog(null,s1,errorMassage,JOptionPane.ERROR_MESSAGE);
        else if(!TESTINPUT.houseBedroomTest(bedroom2.getText())) JOptionPane.showMessageDialog(null,s1,errorMassage,JOptionPane.ERROR_MESSAGE);
        else if(!TESTINPUT.houseServicesTest(services2.getText())) JOptionPane.showMessageDialog(null,"Unvalied ",errorMassage,JOptionPane.ERROR_MESSAGE);
        else{
            int d=0;
            String x = numberHouse2.getText();
            for (int i = 0; i < house1.size(); i++) {
                if (house1.get(i).getNumberhouse() == Integer.parseInt(x)) {
                    JOptionPane.showMessageDialog(null, "the house number already exit ", errorMassage, JOptionPane.ERROR_MESSAGE);
                    d++;
                }
            }
            if(d==0)
            {
                HouseClass h=new HouseClass(temp,services2.getText(),location2.getText(),Integer.parseInt(price2.getText()),
                        Integer.parseInt(balcony2.getText()),Integer.parseInt(bedroom2.getText()),Integer.parseInt(bathroom2.getText())
                        ,Integer.parseInt(numberHouse2.getText()));
                house1.add(h);
                JOptionPane.showMessageDialog(null, "done"+house1.get(0).getNumberhouse(), "correct", JOptionPane.PLAIN_MESSAGE);

            }
        }


    }

}
