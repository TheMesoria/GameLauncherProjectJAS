package pl.softwareforge.view;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneView
        implements Initializable {


    @FXML public AnchorPane contentAnchorPane;
    @FXML private BorderPane mainBorderPane, profileBorderPane;
    @FXML private JFXButton storeButton;
    @FXML private JFXButton libraryButton;
    @FXML private JFXButton communityButton;
    @FXML private JFXButton profileButton;

    @Override public void initialize(URL location,
                           ResourceBundle resources) {

        contentAnchorPane.getChildren().clear();

    }

    @FXML void onMouseClicked(MouseEvent event) throws IOException {

        if (event.getSource() == profileButton)
        {
            loadView();
        }

        else { contentAnchorPane.getChildren().clear(); }

    }

    private void loadView() throws IOException {

        var fxmlLoader = new FXMLLoader(getClass().getResource("/view/ProfileView.fxml"));
        Parent root = fxmlLoader.load();

        AnchorPane.setTopAnchor(root,0d);
        AnchorPane.setRightAnchor(root,0d);
        AnchorPane.setBottomAnchor(root,0d);
        AnchorPane.setLeftAnchor(root,0d);

        contentAnchorPane.getChildren().clear();
        contentAnchorPane.getChildren().add(root);
    }

}