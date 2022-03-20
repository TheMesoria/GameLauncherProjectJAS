package pl.softwareforge.view;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneView
       implements Initializable {
    @Override
    public void initialize(URL location,
                           ResourceBundle resources) {

        System.out.println("Initialized");
    }

    @FXML
    private MFXButton buttonAccount;

    @FXML
    private MFXButton buttonInventory;

    @FXML
    private MFXButton buttonLibrary;

    @FXML
    private MFXButton buttonSettings;

    @FXML
    private MFXButton buttonShop;

    @FXML
    private Pane middlePane;

    @FXML
    void openAccount(MouseEvent event) {
        middlePane.getChildren().clear();
    }

    @FXML
    void openInventory(MouseEvent event) {
        middlePane.getChildren().clear();
    }

    @FXML
    void openLibrary(MouseEvent event) {
        try {
            var fxmlLoader = new FXMLLoader( getClass().getResource( "/view/librarypane.fxml" ) );
            Parent root = fxmlLoader.load();

            AnchorPane.setBottomAnchor( root, 0.0 );
            AnchorPane.setTopAnchor( root, 0.0 );
            AnchorPane.setLeftAnchor( root, 0.0 );
            AnchorPane.setRightAnchor( root, 0.0 );

            root.getStylesheets().add( "/view/styled.css" );
            middlePane.getChildren().clear();
            middlePane.getChildren().add( root );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Clicked");
    }

    @FXML
    void openSettings(MouseEvent event) {
        middlePane.getChildren().clear();
    }

    @FXML
    void openShop(MouseEvent event) {
        middlePane.getChildren().clear();
    }
}

