package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import java.sql.*;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Login_Controller {

    @FXML
    private Rectangle backdrop;

    @FXML
    private AnchorPane left_curtain;

    @FXML
    private Button login_button;

    @FXML
    private TextField password;

    @FXML
    private AnchorPane right_curtain;

    @FXML
    private Ellipse stage;

    @FXML
    private Ellipse stage_shadow;

    @FXML
    private TextField username;

    @FXML
    private Rectangle wood_stage;

    @FXML
    void login_button(ActionEvent event) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try {
            // pst = prepared statement - represents a pre-compiled SQL statement
            // rs = result set - It stores the result returned by the database (receives
            // data from the database)
            // Why rs.next()? - moves the pointer to the next row AND tells you if that row
            // exists.
            // try and catch protect your program from unexpected errors.
            pst = con.prepareStatement(sql); // the one above is the sql code
            pst.setString(1, username.getText()); // so we get the text from the username textfield from scene builder
            pst.setString(2, password.getText()); // same for here
            rs = pst.executeQuery(); // executes the query
            if (rs.next()) { // Checks if a matching user exists in the database.
                Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/resources/FXML/Homepage.fxml")); // Loads
                                                                                                                    // the
                                                                                                                    // Menu.fxml
                                                                                                                    // file.
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                /*
                 * event.getSource()
                 * the button that was clicked.
                 * (Node) event.getSource()
                 * cast it so JavaFX can treat it as a UI object.
                 * .getScene()
                 * get the current scene (Login screen).
                 * .getWindow()
                 * get the window that holds the scene.
                 * (Stage) ...
                 * cast the window into a Stage.
                 */
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } else {
                System.out.println("Login Failed"); // WE NEED TO SWITCH THIS INTO A SCENE LATER

                Parent root = FXMLLoader.load(getClass().getResource("/resources/FXML/Invalid_Login.fxml"));

                Stage popupStage = new Stage();
                Scene popupScene = new Scene(root);

                popupStage.setScene(popupScene);
                popupStage.setTitle("Invalid Login");
                popupStage.show();

            }
        } catch (Exception e) {

        }
    }

    @FXML
    void password(ActionEvent event) {

    }

    @FXML
    void username(ActionEvent event) {

    }

    // variables necessary for running sql code
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login_Controller() {
        con = DbConnection.connect(); // define our db connection and calls the connect method from DbConnection class
    }

}
