package pl.softwareforge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LibraryMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LibraryMain.class.getResource("/view/librarypane.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Library");
        stage.setScene(scene);
        stage.resizableProperty().set(false);
        scene.getStylesheets().add("/view/styled.css");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}