package com.kodilla.tictactoe.tictactoefx;

import com.kodilla.tictactoe.Board;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToeFX extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane gridPane = new GridPane();
        Image imageBackground = new Image("file:src/main/resources/backGround.png");

        BackgroundSize backgroundSize = new BackgroundSize(420, 420, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        ColumnConstraints col0 = new ColumnConstraints(140);
        ColumnConstraints col1 = new ColumnConstraints(140);
        ColumnConstraints col2 = new ColumnConstraints(140);

        RowConstraints row0 = new RowConstraints(140);
        RowConstraints row1 = new RowConstraints(140);
        RowConstraints row2 = new RowConstraints(140);

        gridPane.getColumnConstraints().addAll(col0, col1, col2);
        gridPane.getRowConstraints().addAll(row0, row1, row2);
        gridPane.getAlignment();
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setBackground(background);

        Scene scene = new Scene(gridPane, 420, 420, Color.GOLDENROD);
        primaryStage.setResizable(false);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        Board board = new Board();
        GameFX gameFX = new GameFX(board,gridPane);
        gameFX.display();
        gridPane.setOnMouseClicked(e -> {
            System.out.println(e.getX());
            System.out.println(e.getY());
            int x = (int)(e.getX()/140);
            int y = (int)(e.getY()/140);
            gameFX.move(x,y);

        } );
        primaryStage.show();
    }
}





