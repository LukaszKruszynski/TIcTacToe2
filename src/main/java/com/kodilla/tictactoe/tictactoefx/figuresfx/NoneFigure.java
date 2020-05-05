package com.kodilla.tictactoe.tictactoefx.figuresfx;

import com.kodilla.tictactoe.tictactoefx.figuresfx.Figures;
import javafx.scene.image.Image;

public class NoneFigure extends Figures {
    private Image imageNoneShape = new Image("file:src/main/resources/noneShape.png");

    public Image getImageNoneShape() {
        return imageNoneShape;
    }
}
