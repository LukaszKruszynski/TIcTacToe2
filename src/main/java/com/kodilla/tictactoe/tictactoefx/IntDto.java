package com.kodilla.tictactoe.tictactoefx;

public class IntDto {
    int x;
    int o;

    public IntDto(int randomX, int randomO) {
        this.x = randomX;
        this.o = randomO;
    }

    public int getX() {
        return x;
    }

    public int getO() {
        return o;
    }
}
