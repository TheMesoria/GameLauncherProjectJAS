package pl.softwareforge.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

//public class MainPaneView
//        implements Initializable {
//
//
//    @FXML
//    private BorderPane MainBorderPane;
//    @FXML
//    private JFXButton profileButton;
//    @FXML
//    private JFXButton storeButton;
//
//    int previous = 0;
//    boolean viewLoaded = false;
//
//    @Override
//    public void initialize(URL location,
//                           ResourceBundle resources) {
//        MainBorderPane.getChildren().clear();
//
//        System.out.println("No issues in initialize!");
//    }
//
//    @FXML
//    void OnMouseClicked(MouseEvent event) {
//        if (event.getSource() == profileButton && !viewLoaded) {
//            loadView();
//        } else if (event.getSource() == storeButton) {
//            previous++;
//            loadView();
//        }
//        else {
//            viewLoaded = false;
//            MainBorderPane.getChildren().clear();
//        }
//
//    }
//
//    private void loadView() {
//        try {
//            var fxmlLoader = new FXMLLoader(getClass().getResource("/view/MainPane.fxml"));
//            Parent root = fxmlLoader.load();
//
//            AnchorPane.setBottomAnchor(root, 0.0);
//            AnchorPane.setTopAnchor(root, 0.0);
//            AnchorPane.setLeftAnchor(root, 0.0);
//            AnchorPane.setRightAnchor(root, 0.0);
//
//            root.getStylesheets().add("/css/SimpleStyling.css");
//            if (previous % 3 == 0) {
//                root.getStylesheets().add("");
//            } else if (previous % 3 == 1) {
//                root.getStylesheets().add("");
//            } else if (previous % 3 == 2) {
//                root.getStylesheets().add("");
//            }
//
//            MainBorderPane.getChildren().clear();
//            MainBorderPane.getChildren().add(root);
//
//            viewLoaded = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}