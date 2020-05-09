package com.kodilla.tictactoe.tictactoefx;

public class IntDto {
    int randomX;
    int randomO;

    public IntDto(int randomX, int randomO) {
        this.randomX = randomX;
        this.randomO = randomO;
    }

    public int getRandomX() {
        return randomX;
    }

    public int getRandomO() {
        return randomO;
    }
}
