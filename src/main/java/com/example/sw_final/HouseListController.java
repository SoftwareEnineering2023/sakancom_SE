package com.example.sw_final;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.VBox;

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.net.URL;
        import java.util.ResourceBundle;

public class HouseListController implements Initializable {

    @FXML
    private VBox houseContainer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        populateHouses();
    }

    private void populateHouses() {
        houseContainer.getChildren().clear();

        for (HouseClass house : Sakanat.house1) {
            VBox houseBox = new VBox();
            houseBox.setSpacing(5);

            ImageView imageView = new ImageView();
            try {
                Image image = new Image(new FileInputStream(house.getPicture()));
                imageView.setImage(image);
                imageView.setFitWidth(200);
                imageView.setPreserveRatio(true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Label houseNumberLabel = new Label("House Number: " + house.getNumberhouse());
            Label locationLabel = new Label("Location: " + house.getLocation());
            Label priceLabel = new Label("Price: $" + house.getPrice());
            Label servicesLabel = new Label("Services: " + house.getServices());
            Label balconyLabel = new Label("Balcony: " + house.getBalcony());
            Label bedroomLabel = new Label("Bedroom: " + house.getBedroom());

            // Add the image and labels to the VBox
            houseBox.getChildren().addAll(
                    imageView, houseNumberLabel, locationLabel, priceLabel,
                    servicesLabel, balconyLabel, bedroomLabel
            );

            // Add the VBox to the main houseContainer VBox
            houseContainer.getChildren().add(houseBox);
        }
    }
}
