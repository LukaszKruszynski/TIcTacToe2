package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.figures.None;

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
    //setFigure powinno zwracac true jezeli udalo sie ustawic figure i tylko wtedy w klasie Game przelaczamy kolor gracza.
    //Dopisac metode sprawdzajaca czy ktos wygral np. isWinner() typu boolean.
    //Wykorzystac metode po kazdym ruchu i jezeli jest koniec gry to przerwac petle w klasie game.
    public void setFigure(int col, int row, Figure figure) {
        if (getFigure(col, row) instanceof None)
            rows.get(row).getCols().set(col, figure);
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
}
