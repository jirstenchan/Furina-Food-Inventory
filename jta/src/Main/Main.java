package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.w3c.dom.css.Rect;

import java.sql.SQLException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    // @Override
    // public void start(Stage stage) throws Exception {
    /*
     * //SCENES AND STAGES - Architecture
     * //Stage stage = new Stage(); -- FOR CREATING NEW STAGE
     * Group root = new Group(); // content
     * Scene scene = new Scene(root, 400, 300, Color.BLACK); // errors if you dont
     * have root
     * //Color.___ Customization
     * 
     * //ADDING IMAGE TO THE STAGE
     * Image logo = new
     * Image(getClass().getResource("/resources/Images/Logo.png").toString());
     * //ask sir how to out it
     * 
     * //STAGE CUSTOMIZATION (WINDOW CUSTOMIZATION)
     * stage.getIcons().add(logo);
     * stage.setTitle("JTA"); // sets title of window
     * stage.setWidth(420);
     * stage.setHeight(420);
     * stage.setResizable(false); // prevents resizing
     * //Normally fx places your screen in the middle, but swing doesnt do that so
     * if you want
     * //stage.setX(50); // X position of window
     * //stage.setY(50); // Y position of window
     * 
     * //FULLSCREEN MODE
     * /* stage.setFullScreen(true); // FULLSCREEN MODE
     * //Changes the text that notifies how to exit fullscreen
     * stage.setFullScreenExitHint("Press x to exit fullscreen");
     * // changes the key combination to exit fullscreen
     * stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("x"));
     */

    /*
     * // ADDING TEXT TO THE SCENE
     * Text text = new Text(); // creating instance of Texxt class
     * text.setText("Hello, JTA!"); // setting text to display
     * text.setX(100); // X position of text
     * text.setY(200); // Y position of text
     * text.setFill(Color.WHITE); // text color
     * text.setFont(Font.font("Calibri", 50)); // font and size
     * 
     * // ADDING LINE TO THE SCENE
     * Line line = new Line();
     * line.setStartX(250);
     * line.setStartY(200);
     * line.setEndX(300);
     * line.setEndY(200);
     * line.setStroke(Color.RED);
     * line.setStrokeWidth(5);
     * line.setRotate(45); // rotates line by 45 degrees
     * line.setOpacity(0.5);
     * 
     * //ADDING RECTANGLE TO THE SCENE
     * Rectangle rect = new Rectangle();
     * rect.setX(0);
     * rect.setY(0);
     * rect.setWidth(100);
     * rect.setHeight(150);
     * rect.setFill(Color.WHITE);
     * rect.setStroke(Color.WHITE);
     * rect.setStrokeWidth(3);
     * 
     * //ADDING TRIANGLE TO THE SCENEQ
     * Polygon triangle = new Polygon();
     * triangle.getPoints().addAll(new Double[]{ //basically points of triangle,
     * theres 3 points
     * 200.0, 50.0,
     * 250.0, 150.0,
     * 150.0, 150.0
     * });
     * triangle.setFill(Color.BLUE);
     * triangle.setStroke(Color.YELLOW);
     * triangle.setStrokeWidth(4);
     * 
     * //ADDING CIRCLE TO THE SCENE
     * Circle circle = new Circle();
     * circle.setCenterX(300);
     * circle.setCenterY(100);
     * circle.setRadius(50);
     * circle.setFill(Color.GREEN);
     * circle.setStroke(Color.BLACK);
     * circle.setStrokeWidth(3);
     * 
     * 
     * //ADDING IMAGE TO THE SCENE
     * Image img = new Image("/resources/Images/Logo.png");
     * ImageView imgView = new ImageView(img);
     * imgView.setX(150);
     * imgView.setY(220);
     * imgView.setFitWidth(100);
     * imgView.setFitHeight(100);
     * 
     * //root is the name of the node
     * root.getChildren().add(imgView);
     * root.getChildren().add(circle); // adding circle to root so it can be
     * displayed
     * root.getChildren().add(triangle); // adding triangle to root so it can be
     * displayed
     * root.getChildren().add(rect); // adding rectangle to root so it can be
     * displayed
     * root.getChildren().add(line); // adding line to root so it can be displayed
     * root.getChildren().add(text); // adding text to root so it can be displayed
     * stage.setScene(scene); // REQUIRED, legit jus setting it so u can display
     * stuff
     * stage.show();
     */
    // }

    // ADDING FXML
    public void start(Stage stage) {

        try {
            Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/resources/FXML/Login.fxml"));
            Scene scene = new Scene(root);
            // Adding css
            // scene.getStylesheets().add(getClass().getResource("/resources/CSS/Login.css").toExternalForm());
            stage.setScene(scene);
            stage.setTitle("Genshin Impact Menu");
            stage.setResizable(false); // prevents resizing
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}
