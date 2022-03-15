package pl.softwareforge.view;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneView
        implements Initializable {


    @FXML public AnchorPane contentPane;
    @FXML private BorderPane mainBorderPane, profileBorderPane;
    @FXML private JFXButton storeButton;
    @FXML private JFXButton libraryButton;
    @FXML private JFXButton communityButton;
    @FXML private JFXButton profileButton;

    int previous = 0;
    boolean viewLoaded = false;

    @Override
    public void initialize(URL location,
                           ResourceBundle resources) {
        contentPane.getChildren().clear();

        System.out.println("No issues in initialize!");
    }

    @FXML
    void onMouseClicked(MouseEvent event) {


        if (event.getSource() == profileButton && !viewLoaded) {
            loadView();

            contentPane.setVisible(true);
        } else if (event.getSource() == storeButton) {
            previous++;
            loadView();
        } else {
            viewLoaded = false;
            contentPane.getChildren().clear();
        }

    }

    private void loadView() {
        try {
            var fxmlLoader = new FXMLLoader(getClass().getResource("/view/ProfileView.fxml"));
            Parent root = fxmlLoader.load();

            AnchorPane.setBottomAnchor(root, 0.0);
            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);

            root.getStylesheets().add("/css/SimpleStyling.css");
            if (previous % 3 == 0) {
                root.getStylesheets().add("");
            } else if (previous % 3 == 1) {
                root.getStylesheets().add("");
            } else if (previous % 3 == 2) {
                root.getStylesheets().add("");
            }

            contentPane.getChildren().clear();
            contentPane.getChildren().add(root);

            viewLoaded = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}