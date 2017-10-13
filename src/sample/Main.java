package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
// Test
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        //Lyout Container erstellen
        VBox vbox1 = new VBox();
        vbox1.setPadding(new Insets(25,25,25,25));
        vbox1.setSpacing(25);

        //Komponenten erstellen
        Label label = new Label();
        Button button1 = new Button("ACTION");

        //Label und Button in den Scene Graph einfügen
        vbox1.getChildren().add(button1);
        vbox1.getChildren().add(label);

        //Erstellung der Scene und Hinzufügen zur Stage
        Scene scene = new Scene(vbox1);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
