package com.kodilla.tictactoe.figures;

import javafx.scene.image.ImageView;

public class None extends Figure {
    @Override
    public String toString() {
        return " ";
    }
    @Override
    public ImageView getImageView() {
        return null;
    }
}
