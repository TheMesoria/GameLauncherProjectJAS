package pl.softwareforge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main
        extends Application
{
    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        var fxmlLoader = new FXMLLoader( getClass().getResource( "/view/MainPane.fxml" ) );

        Parent root = fxmlLoader.load();
        var scene = new Scene( root );

        scene.getStylesheets().add( "/css/SimpleStyling.css" );

        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args )
    {
        launch( args );
    }
}
