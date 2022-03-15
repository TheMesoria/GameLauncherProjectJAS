package pl.softwareforge.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileViewController
        implements Initializable {

    @FXML BorderPane profileBorderPane;
    @FXML JFXButton addFriendButton, editProfileButton, addCommentButton;
    @FXML TextField searchFriendsTextField, commentTextField;
    @FXML TextArea commentTextArea, profileInfoTextArea;
    @FXML Pane firstGameActivityPane, secondGameActivityPane, thirdGameActivityPane;
    @FXML ListView friendsListView;
    @FXML MenuButton friendsMenuButton;
    @FXML MenuItem activeFriendsMenuItem, allFriendsMenuItem;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

    @FXML void onMouseClicked(MouseEvent event){



    }

}
