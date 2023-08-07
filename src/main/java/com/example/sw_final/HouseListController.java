package com.example.sw_final;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;

        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
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
    private Button bookHouse;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        populateHouses();


    }

    @FXML
    private void bookButtonHandls() {
        TenantClass tenantB = null;

        // Find the tenant with the matching ID
        String tenantUsername = LoginControl1.userlog;// Get the tenant ID from login page
        for (TenantClass tenant : Sakanat.tenant1) {
            if (tenantUsername.equals(tenant.getUsername())) {
                tenantB = tenant;
                break; // Found the tenant, no need to continue looping
            }
        }

        if (tenantB == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("// Tenant with the specified ID was not found");
            alert.setHeaderText(null);
            alert.setContentText("You have already booked a house.");
            alert.showAndWait();
            return;
        }

        if (tenantB.isBooked()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("You are already booked");
            alert.setHeaderText(null);
            alert.setContentText("You have already booked a house.");
            alert.showAndWait();
        } else {
            tenantB.setBooked(true);

            // Display a success message
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Booking Successful");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully booked a house.");
            alert.showAndWait();
        }
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
            bookHouse = new Button("BOOK");
            bookHouse.setOnAction(e -> bookButtonHandls());
                    houseBox.getChildren().addAll(
                    imageView, houseNumberLabel, locationLabel, priceLabel,
                    servicesLabel, balconyLabel, bedroomLabel,bookHouse
            );

            houseContainer.getChildren().add(houseBox);

            // here i want to put a button action event for each button

        }
    }
}
