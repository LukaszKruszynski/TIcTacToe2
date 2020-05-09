package com.kodilla.tictactoe.figures;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class O extends Figure {
    Image oImage = new Image("file:src/main/resources/oShape.png");
    @Override
    public String toString() {
        return "O";
    }
    @Override
    public ImageView getImageView() {
        return new ImageView(oImage);
    }
}
