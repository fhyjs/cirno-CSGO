package cn.fhyjs.cirno.csgo.cirnocsgo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1040, 624);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.initStyle(StageStyle.DECORATED);
        stage.getScene().setFill(null);
        scene.getStylesheets().add(String.valueOf(Main.class.getResource("main.css")));
        //stage.getScene().getRoot().setStyle("-fx-background-color: transparent");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}