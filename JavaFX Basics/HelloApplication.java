package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group parent1 = new Group();
        Scene scene1 = new Scene(parent1, Color.AQUA);

        stage.setHeight(500);
        stage.setWidth(500);
        stage.setX(100);
        stage.setY(100);

        //TEXT
        Text text = new Text();
        text.setText("Hello Students");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Times New Roman",25));
        text.setFill(Color.valueOf("#4c0994"));

        parent1.getChildren().add(text);

        //RECTANGLE
        Rectangle rect = new Rectangle();
        rect.setX(100);
        rect.setY(200);
        rect.setWidth(50);
        rect.setHeight(100);
        rect.setFill(Color.BLUE); //Colors rectangle
        rect.setStrokeWidth(5); //Border width
        rect.setStroke(Color.RED); //Border color

        parent1.getChildren().add(rect);

        //CIRCLE
        Circle circle = new Circle();
        double X = 200;
        double Y = 200;
        circle.setCenterX(X);
        circle.setCenterY(Y);
        circle.setRadius(25);
        circle.setFill(Color.YELLOW);
        circle.setStrokeWidth(5);
        circle.setStroke(Color.GREEN);

        parent1.getChildren().add(circle);

        //BUTTON
        Button button = new Button();
        button.setText("Test Button");
        button.setLayoutX(100);
        button.setLayoutY(400);

        button.setOnAction( e ->
        {
            Text text2 = new Text();
            text2.setText("Button Works");
            text2.setX(400);
            text2.setY(400);
            parent1.getChildren().add(text2);
        });

        parent1.getChildren().add(button);

        //BUTTON FOR SCENE CHANGE
        Button button2 = new Button();
        button2.setText("Change Scene");
        button2.setLayoutX(350);
        button2.setLayoutY(400);

        parent1.getChildren().add(button2);

        Group parent2 = new Group();
        Scene scene2 = new Scene(parent2);

        Button button3 = new Button();
        button3.setText("Go Back");
        parent2.getChildren().add(button3);

        //Set button action using lambda expression
        button2.setOnAction(e -> {
            stage.setScene(scene2); } //Scene does not change
        );

        button3.setOnAction(e -> {
            stage.setScene(scene1);
        });

        //ADDING ICON
        Image uiu = new Image(new FileInputStream("E:\\AOOP (I)\\Class 2\\JavaFXDemo\\src\\uiu.jpg"));
        stage.getIcons().add(uiu);
        stage.setTitle("MYYYYYY PROJEEEEECTTTTTTTTT");

        //IMAGE
        Image catpic = new Image(new FileInputStream("E:\\AOOP (I)\\Class 2\\JavaFXDemo\\src\\cat.jpg"));
        ImageView image = new ImageView(catpic); //Pass the image object, make image object similarly as done in icon
        image.setX(350);
        image.setY(150);
        image.setFitWidth(150);
        image.setFitHeight(150);

        parent1.getChildren().add(image);

        ImageView image2 = new ImageView(uiu); //Pass the image object, make image object similarly as done in icon
        image2.setX(350);
        image2.setY(270);
        image2.setFitWidth(100);
        image2.setFitHeight(100);

        parent2.getChildren().add(image2);

        stage.setScene(scene1);
        stage.show();



        stage.setScene(scene1);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
