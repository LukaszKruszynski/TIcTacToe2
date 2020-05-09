package com.kodilla.tictactoe.figures;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class None extends Figure {
    Image noneImage = new Image("file:src/main/resources/noneShape.png");
    @Override
    public String toString() {
        return " ";
    }
    @Override
    public ImageView getImageView() {
        return new ImageView(noneImage);
    }
}
