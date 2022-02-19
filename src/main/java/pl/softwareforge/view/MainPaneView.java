package pl.softwareforge.view;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneView
        implements Initializable
{

    @FXML private AnchorPane MainAnchorPane;
    @FXML private JFXButton ProfileButton;
    @FXML private JFXButton SettingsButton;

    int previous = 0;
    boolean viewLoaded = false;

    @Override public void initialize( URL location,
                                      ResourceBundle resources )
    {
        MainAnchorPane.getChildren().clear();

        System.out.println( "No issues in initialize!" );
    }

    @FXML void OnMouseClicked( MouseEvent event )
    {
        if ( event.getSource() == ProfileButton && !viewLoaded )
        {
            loadView();
        }
        else if ( event.getSource() == SettingsButton )
        {
            previous++;
            loadView();
        }
        else
        {
            viewLoaded = false;
            MainAnchorPane.getChildren().clear();
        }

    }

    private void loadView()
    {
        try
        {
            var fxmlLoader = new FXMLLoader( getClass().getResource( "/view/ProfileView.fxml" ) );
            Parent root = fxmlLoader.load();

            AnchorPane.setBottomAnchor( root, 0.0 );
            AnchorPane.setTopAnchor( root, 0.0 );
            AnchorPane.setLeftAnchor( root, 0.0 );
            AnchorPane.setRightAnchor( root, 0.0 );

            root.getStylesheets().add( "/css/SimpleStyling.css" );
            if ( previous % 3 == 0 )
            {
                root.getStylesheets().add( "/css/BrightTheme.css" );
            }
            else if ( previous % 3 == 1 )
            {
                root.getStylesheets().add( "/css/DarkTheme.css" );
            }
            else if ( previous % 3 == 2 )
            {
                root.getStylesheets().add( "/css/CyanTheme.css" );
            }

            MainAnchorPane.getChildren().clear();
            MainAnchorPane.getChildren().add( root );

            viewLoaded = true;
        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
    }
}
