package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;
import com.kodilla.tictactoe.figures.O;
import com.kodilla.tictactoe.figures.X;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Game {

    private boolean isMoveX = true;

    public void run() {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start: X");
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
                if (isMoveX==true) {
                    System.out.println("Turn: O");
                }else {
                    System.out.println("Turn: X");
                }
                isMoveX = !isMoveX;
            }
            if(board.isWinner()==true) {
                System.out.println("Winner: "+ board.getFigure(col,row) + ".");
                break;
            }
            if(board.fullBoard()==true) {
                System.out.println("Draw.");
                break;
            }
        }
    }
}
