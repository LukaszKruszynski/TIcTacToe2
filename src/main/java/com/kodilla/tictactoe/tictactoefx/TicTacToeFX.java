package com.kodilla.tictactoe.tictactoefx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToeFX extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BoardFX boardFX = new BoardFX();
        Scene scene = new Scene(boardFX.gridPane, 420, 420, Color.GOLDENROD);
        boardFX.loadGridPane();
        boardFX.fillBoard();

        primaryStage.setResizable(false);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
