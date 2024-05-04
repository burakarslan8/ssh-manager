package whxper.sshmanager;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @FXML
    private Button newHostButton;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        Main controller = loader.getController();

        controller.newHostButton.setOnAction(event -> {
            System.out.println("Button clicked");
        });

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("SSH Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}