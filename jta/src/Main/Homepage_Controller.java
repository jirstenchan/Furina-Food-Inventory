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

public class Homepage_Controller {

    @FXML
    private Button analytics_homepage;

    @FXML
    private Button inventory_homepage;

    @FXML
    private Button menu_homepage;

    @FXML
    void analytics_homepage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/FXML/Analytics.fxml")); // JUST AN EXAMPLE
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void inventory_homepage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/FXML/Inventory.fxml")); // JUST AN EXAMPLE
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void menu_homepage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/FXML/Menu.fxml")); // JUST AN EXAMPLE
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
