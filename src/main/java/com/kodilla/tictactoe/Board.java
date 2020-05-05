package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.figures.None;
import com.kodilla.tictactoe.figures.O;
import com.kodilla.tictactoe.figures.X;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int n = 0; n < 3; n++)
            rows.add(new BoardRow());
    }

    public Figure getFigure(int col, int row) {
        return rows.get(row).getCols().get(col);
    }

    public boolean setFigure(int col, int row, Figure figure) {
        boolean emptyPlace = false;
        if (getFigure(col, row) instanceof None) {
            rows.get(row).getCols().set(col, figure);
            emptyPlace = true;
        }
        return emptyPlace;
    }

    @Override
    public String toString() {
        String s = "|-----------|\n";
        for (int row = 0; row < 3; row++) {
            s += "|";
            for (int col = 0; col < 3; col++) {
                s += " " + getFigure(col, row).toString() + " |";
            }
            s += "\n";
        }
        s += "|-----------|\n";
        return s;
    }

    public boolean isX(int col, int row) {
        return getFigure(col, row) instanceof X;
    }

    public boolean isO(int col, int row) {
        return getFigure(col, row) instanceof O;
    }

    public boolean isWinner() {

        for (int row = 0; row < 3; row++) {
            if (isX(0, row) && isX(1, row) && isX(2, row)) {
                return true;
            }
        }

        for (int row = 0; row < 3; row++) {
            if (isO(0, row) && isO(1, row) && isO(2, row)) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (isX(col, 0) && isX(col, 1) && isX(col, 2)) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (isO(col, 0) && isO(col, 1) && isO(col, 2)) {
                return true;
            }
        }

        if (isX(0, 0) && isX(1, 1) && isX(2, 2) || isO(0, 0) && isO(1, 1) && isO(2, 2)) {
            return true;
        }
        if (isX(2, 0) && isX(1, 1) && isX(0, 2) || isO(2, 0) && isO(1, 1) && isO(0, 2)) {
            return true;
        }
        return false;
    }

    public boolean fullBoard() {
        boolean isFullBoard = true;
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                if (getFigure(col, row) instanceof None) {
                    isFullBoard = false;
                }
            }
        }
        return isFullBoard;
    }
}














