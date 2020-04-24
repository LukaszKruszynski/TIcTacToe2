package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.figures.O;
import com.kodilla.tictactoe.figures.X;

import java.util.Scanner;

public class Game {

    private boolean isMoveX = true;

    public void run() {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("col:");
            int col = Integer.parseInt(scanner.nextLine());
            System.out.println("row:");
            int row = Integer.parseInt(scanner.nextLine());
            Figure figure = isMoveX ? new X() : new O();
            boolean legalMove = board.setFigure(col, row, figure);
            System.out.println(board);
            if (legalMove == false) {
                System.out.println("Place is busy! Try again: " + figure + ".");
            } else {
                isMoveX = !isMoveX;
                if(board.isWinner() == true) {
                    break;
                }
                if (board.fullBoard() == true) {
                    break;
                }
            }
        }
    }
}

