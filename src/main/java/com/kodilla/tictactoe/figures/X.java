package com.kodilla.tictactoe.figures;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class X extends Figure {
    private Image xImage = new Image("file:src/main/resources/xShape.png");
    @Override
    public String toString() {
        return "X";
    }
    @Override
    public ImageView getImageView() {
        return new ImageView(xImage);
    }
}
