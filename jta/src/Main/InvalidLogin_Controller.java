package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InvalidLogin_Controller {

    @FXML
    private Button ok_invalid;

    @FXML
    void ok_invalid(ActionEvent event) {
        Stage stage = (Stage) ok_invalid.getScene().getWindow();// fx:id of your button
        stage.close(); // closes the popup window
    }

}
