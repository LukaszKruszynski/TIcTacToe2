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

    public void isWinner() {
        List<Figure> topRow = new ArrayList<>();
        List<Figure> midRow = new ArrayList<>();
        List<Figure> downRow = new ArrayList<>();
        List<Figure> leftCol = new ArrayList<>();
        List<Figure> midCol = new ArrayList<>();
        List<Figure> rightCol = new ArrayList<>();
        List<Figure> cross1 = new ArrayList<>();
        List<Figure> cross2 = new ArrayList<>();
        List<List> winning = new ArrayList<>();

        Figure leftUpField = getFigure(0, 0);
        Figure leftMidField = getFigure(0, 1);
        Figure leftDownField = getFigure(0, 2);
        Figure midUpField = getFigure(1, 0);
        Figure midMidField = getFigure(1, 1);
        Figure midDownField = getFigure(1, 2);
        Figure rightUpField = getFigure(2, 0);
        Figure rightMidField = getFigure(2, 1);
        Figure rightDownField = getFigure(2, 2);

        topRow.add(leftUpField);
        topRow.add(midUpField);
        topRow.add(rightUpField);

        midRow.add(leftMidField);
        midRow.add(midMidField);
        midRow.add(rightMidField);

        downRow.add(leftDownField);
        downRow.add(midDownField);
        downRow.add(rightDownField);

        leftCol.add(leftUpField);
        leftCol.add(leftMidField);
        leftCol.add(leftDownField);

        midCol.add(midUpField);
        midCol.add(midMidField);
        midCol.add(midDownField);

        rightCol.add(rightUpField);
        rightCol.add(rightMidField);
        rightCol.add(rightDownField);

        cross1.add(leftUpField);
        cross1.add(midMidField);
        cross1.add(rightDownField);

        cross2.add(rightUpField);
        cross2.add(midMidField);
        cross2.add(leftDownField);

        winning.add(topRow);
        winning.add(midRow);
        winning.add(downRow);
        winning.add(leftCol);
        winning.add(rightCol);
        winning.add(midCol);
        winning.add(cross1);
        winning.add(cross2);
    }
}




