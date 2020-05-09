package com.kodilla.tictactoe.tictactoefx;

import com.kodilla.tictactoe.Board;
import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.figures.None;
import com.kodilla.tictactoe.figures.O;
import com.kodilla.tictactoe.figures.X;
import javafx.scene.layout.GridPane;

import java.util.Random;

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
                gridPane.add(figure.getImageView(), col, row);
            }
        }
    }

    public void moveX(int x, int y) {
        board.setFigure(x, y, new X());
        display();
    }

    public boolean checker(int x, int y) {
        if (board.getFigure(x, y) instanceof None) {
            return true;
        } else {
            return false;
        }
    }

    public void moveO(int x, int y) {
        board.setFigure(x, y, new O());
        display();
    }

    public int randomGeneratorX() {
        Random randomForX = new Random();
        int randomX = randomForX.nextInt(3);
        return randomX;
    }

    public int randomGeneratorO() {
        Random randomForO = new Random();
        int randomO = randomForO.nextInt(3);
        return randomO;
    }

    public IntDto computerMoveO() {
        Random randomForO = new Random();
        int randomO = randomForO.nextInt(3);
        Random randomForX = new Random();
        int randomX = randomForX.nextInt(3);
        board.setFigure(randomX,randomO, new O());
        display();
        return new IntDto(randomX,randomO);

    }
}
