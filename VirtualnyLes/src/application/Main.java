package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
    private Pane root = new Pane();
    private Random random = new Random();


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Rastliny App");
        int scene_X = 800;
        int scene_Y = 600;
        Scene scene = new Scene(root, scene_X, 600);
        primaryStage.setScene(scene);
        
        Rectangle rectangle = new Rectangle(0, 0, 50, scene_Y); 
        rectangle.setFill(Color.BLACK);
        root.getChildren().add(rectangle);

        // buttons
        Button stromButton = new Button("Strom");
        stromButton.setLayoutX(0);
        stromButton.setLayoutY(0);
        stromButton.setPrefWidth(50);
        stromButton.setPrefHeight(10);
        Button kvetButton = new Button("Kvet");
        kvetButton.setLayoutX(0);
        kvetButton.setLayoutY(50);
        kvetButton.setPrefWidth(50);
        kvetButton.setPrefHeight(10);
        Button krikButton = new Button("Krik");
        krikButton.setLayoutX(0);
        krikButton.setLayoutY(100);
        krikButton.setPrefWidth(50);
        krikButton.setPrefHeight(10);

        // buttons action
        stromButton.setOnAction(event -> {
            Rastlina rastlina = new Strom(random.nextInt(scene_X - 120), random.nextInt(scene_Y - 100), root);

        });
        kvetButton.setOnAction(event ->{
            Rastlina rastlina = new Kvet(random.nextInt(scene_X - 150), random.nextInt(scene_Y - 100), root);

        });
        krikButton.setOnAction(event -> {
            Rastlina rastlina = new Krik(random.nextInt(scene_X - 150), random.nextInt(scene_Y - 100), root);
    
        });

        root.getChildren().addAll(stromButton, kvetButton, krikButton);

        primaryStage.show();


    }
    ///////////////////////////////////////////
    public static void main(String[] args) {
        launch(args);
    }
}
