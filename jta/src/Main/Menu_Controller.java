package Main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Menu_Controller {
    @FXML
    private Button analytics_menu;

    @FXML
    private Button homepage_menu;

    @FXML
    private Button inventory_menu;

    @FXML
    void analytics_menu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/FXML/Analytics.fxml")); // JUST AN EXAMPLE
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void homepage_menu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/FXML/Homepage.fxml")); // JUST AN EXAMPLE
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void inventory_menu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/FXML/Inventory.fxml")); // JUST AN EXAMPLE
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
