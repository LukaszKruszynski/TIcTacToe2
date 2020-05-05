package com.kodilla.tictactoe.tictactoefx.figuresfx;

import com.kodilla.tictactoe.tictactoefx.figuresfx.Figures;
import javafx.scene.image.Image;

public class XFigure extends Figures {
    private Image imageXShape = new Image("file:src/main/resources/xShape.png");

    public Image getImageXShape() {
        return imageXShape;
    }
}
