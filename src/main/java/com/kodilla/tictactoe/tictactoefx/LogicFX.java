package com.kodilla.tictactoe.tictactoefx;

import com.kodilla.tictactoe.tictactoefx.figuresfx.OFigure;

import java.util.Random;

public class LogicFX {
    Random random = new Random();
    int randomInt = random.nextInt(9) + 1;
    BoardFX boardFX = new BoardFX();
    OFigure oFigure = new OFigure();

}


