package com.kodilla.tictactoe;

public class WinnerDto {
    private boolean isWinner;
    private String whoWins;

    public WinnerDto(boolean isWinner, String whoWins) {
        this.isWinner = isWinner;
        this.whoWins = whoWins;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public String getWhoWins() {
        return whoWins;
    }

    public void setWhoWins(String whoWins) {
        this.whoWins = whoWins;
    }
}
