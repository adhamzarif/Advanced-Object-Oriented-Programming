package com.example.scenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    Circle c = new Circle();

    @FXML
    public void moveUp(ActionEvent event)
    {
        System.out.println("UP");
        c.setCenterY(c.getCenterY() - 10);
    }

    @FXML
    public void moveDown(ActionEvent event)
    {
        System.out.println("DOWN");
        c.setCenterY(c.getCenterY() + 10);
    }

    @FXML
    public void moveLeft(ActionEvent event)
    {
        System.out.println("LEFT");
        c.setCenterX(c.getCenterX() - 10);
    }

    @FXML
    public void moveRight(ActionEvent event)
    {
        System.out.println("RIGHT");
        c.setCenterX(c.getCenterX() + 10);
    }

    @FXML
    public void zoomIn(ActionEvent event)
    {
        c.setRadius(c.getRadius() + 10);
    }

    @FXML
    public void zoomOut(ActionEvent event)
    {
        c.setRadius(c.getRadius() - 10);
    }

    private Stage stage;
    private Scene scene;

    @FXML
    public void goToScene2(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view2.fxml"));
        scene = new Scene(fxmlLoader.load());

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
