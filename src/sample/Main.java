package sample;


import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
// Test
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");

        //Lyout Container erstellen
        VBox vbox1 = new VBox();
        vbox1.setPadding(new Insets(25,25,25,25));
        vbox1.setSpacing(25);

        //Komponenten erstellen
        Label label = new Label();
        Button button1 = new Button("ACTION");
        button1.setOnAction(e -> label.setText("Hallo Welt!"));

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
