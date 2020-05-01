package com.kodilla.tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class TicTacToeFX extends Application {

    private Image imageBackground = new Image("file:src/main/resources/backGround.png");
    private Image imageOShape = new Image("file:src/main/resources/oShape.png");
    private Image imageXShape = new Image("file:src/main/resources/xShape.png");
    private Image imageNoneShape = new Image("file:src/main/resources/noneShape.png");

    public void setImageFigure() {

    }

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
        ImageView col0Row0 = new ImageView(imageNoneShape);
        ImageView col0Row1 = new ImageView(imageNoneShape);
        ImageView col0Row2 = new ImageView(imageNoneShape);
        ImageView col1Row0 = new ImageView(imageNoneShape);
        ImageView col1Row1 = new ImageView(imageNoneShape);
        ImageView col1Row2 = new ImageView(imageNoneShape);
        ImageView col2Row0 = new ImageView(imageNoneShape);
        ImageView col2Row1 = new ImageView(imageNoneShape);
        ImageView col2Row2 = new ImageView(imageNoneShape);

        ColumnConstraints col0 = new ColumnConstraints(140);
        ColumnConstraints col1 = new ColumnConstraints(140);
        ColumnConstraints col2 = new ColumnConstraints(140);

        RowConstraints row0 = new RowConstraints(140);
        RowConstraints row1 = new RowConstraints(140);
        RowConstraints row2 = new RowConstraints(140);

        GridPane gridPane = new GridPane();



        gridPane.getColumnConstraints().addAll(col0, col1, col2);
        gridPane.getRowConstraints().addAll(row0, row1, row2);
        gridPane.getAlignment();

        gridPane.add(col0Row0, 0, 0);
        gridPane.add(col0Row1, 0, 1);
        gridPane.add(col0Row2, 0, 2);
        gridPane.add(col1Row0, 1, 0);
        gridPane.add(col1Row1, 1, 1);
        gridPane.add(col1Row2, 1, 2);
        gridPane.add(col2Row0, 2, 0);
        gridPane.add(col2Row1, 2, 1);
        gridPane.add(col2Row2, 2, 2);
        /*
        gridPane.add(imageViewXShape, 1, 2);
        gridPane.add(imageViewOShape, 0, 0);

         */
        col0Row0.setOnMouseClicked(setXCol0Row0 -> col0Row0.setImage(imageXShape));
        col0Row1.setOnMouseClicked(setXCol0Row1 -> col0Row1.setImage(imageXShape));
        col0Row2.setOnMouseClicked(setXCol0Row2 -> col0Row2.setImage(imageXShape));
        col1Row0.setOnMouseClicked(setXCol1Row0 -> col1Row0.setImage(imageXShape));
        col1Row1.setOnMouseClicked(setXCol1Row1 -> col1Row1.setImage(imageXShape));
        col1Row2.setOnMouseClicked(setXCol1Row2 -> col1Row2.setImage(imageXShape));
        col2Row0.setOnMouseClicked(setXCol2Row0 -> col2Row0.setImage(imageXShape));
        col2Row1.setOnMouseClicked(setXCol2Row1 -> col2Row1.setImage(imageXShape));
        col2Row2.setOnMouseClicked(setXCol2Row2 -> col2Row2.setImage(imageXShape));


        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setBackground(background);
        Scene scene = new Scene(gridPane, 420, 420, Color.GOLDENROD);

        primaryStage.setResizable(false);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
