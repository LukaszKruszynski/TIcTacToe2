package com.kodilla.tictactoe.tictactoefx;

import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.tictactoefx.figuresfx.XFigure;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToeFX extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BoardFX boardFX = new BoardFX();
        LogicFX logicFX = new LogicFX();
        Scene scene = new Scene(boardFX.gridPane, 420, 420, Color.GOLDENROD);
        boardFX.loadGridPane();
        boardFX.fillBoard();
        primaryStage.setResizable(false);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
        boardFX.setOFigureRandom();
        boardFX.setFigure();

    }
}





