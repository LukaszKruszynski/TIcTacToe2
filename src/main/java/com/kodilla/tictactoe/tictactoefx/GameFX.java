package com.kodilla.tictactoe.tictactoefx;

import com.kodilla.tictactoe.Board;
import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.figures.X;
import javafx.scene.layout.GridPane;

public class GameFX {
    private final Board board;
    private final GridPane gridPane;

    public GameFX(Board board, GridPane gridPane) {
        this.board = board;
        this.gridPane = gridPane;
    }

    public void display() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Figure figure = board.getFigure(col, row);
                gridPane.add(figure.getImageView(),col, row);
            }
        }
    }
    public void move(int x, int y) {
        board.setFigure(x,y,new X());
        display();
    }
}
