package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.figures.None;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> cols = new ArrayList<>();

    public List<Figure> getCols() {
        return cols;
    }

    public BoardRow() {
        for(int n=0;n<3;n++)
            cols.add(new None());
    }
}
