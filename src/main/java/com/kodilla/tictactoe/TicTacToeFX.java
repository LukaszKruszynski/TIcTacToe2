package com.kodilla.tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class TicTacToeFX extends Application {

    private Image imageBackground = new Image("file:src/main/resources/backGround.png");
    private Image imageOShape = new Image("file:src/main/resources/oShape.png");
    private Image imageXShape = new Image("file:src/main/resources/xShape.png");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        BackgroundSize backgroundSize = new BackgroundSize(420, 420, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        ImageView imageViewOShape = new ImageView(imageOShape);
        ImageView imageViewXShape = new ImageView(imageXShape);




        ColumnConstraints col0 = new ColumnConstraints(137);
        ColumnConstraints col1 = new ColumnConstraints(137);
        ColumnConstraints col2 = new ColumnConstraints(137);

        RowConstraints row0 = new RowConstraints(137);
        RowConstraints row1 = new RowConstraints(137);
        RowConstraints row2 = new RowConstraints(137);

        GridPane gridPane = new GridPane();

        gridPane.getColumnConstraints().addAll(col0,col1,col2);
        gridPane.getRowConstraints().addAll(row0,row1,row2);

        gridPane.add(imageViewXShape,0,2);
        gridPane.add(imageViewOShape,1,2);

        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setPadding(new Insets(5));
        gridPane.setBackground(background);

        Scene scene = new Scene(gridPane, 420, 420, Color.GOLDENROD);

        primaryStage.setResizable(false);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
