package com.kodilla.tictactoe.tictactoefx;

import com.kodilla.tictactoe.tictactoefx.figuresfx.NoneFigure;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class BoardFX {
    public GridPane gridPane = new GridPane();
    private NoneFigure noneFigure = new NoneFigure();
    private Image imageNoneShape = noneFigure.getImageNoneShape();

    private Image imageBackground = new Image("file:src/main/resources/backGround.png");

    BackgroundSize backgroundSize = new BackgroundSize(420, 420, true, true, true, false);
    BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
    Background background = new Background(backgroundImage);

    ImageView col0Row0 = new ImageView(imageNoneShape);
    ImageView col0Row1 = new ImageView(imageNoneShape);
    ImageView col0Row2 = new ImageView(imageNoneShape);
    ImageView col1Row0 = new ImageView(imageNoneShape);
    ImageView col1Row1 = new ImageView(imageNoneShape);
    ImageView col1Row2 = new ImageView(imageNoneShape);
    ImageView col2Row0 = new ImageView(imageNoneShape);
    ImageView col2Row1 = new ImageView(imageNoneShape);
    ImageView col2Row2 = new ImageView(imageNoneShape);


    ColumnConstraints col0 = new ColumnConstraints(140);
    ColumnConstraints col1 = new ColumnConstraints(140);
    ColumnConstraints col2 = new ColumnConstraints(140);

    RowConstraints row0 = new RowConstraints(140);
    RowConstraints row1 = new RowConstraints(140);
    RowConstraints row2 = new RowConstraints(140);

    public void fillBoard() {
        gridPane.add(col0Row0, 0, 0);
        gridPane.add(col0Row1, 0, 1);
        gridPane.add(col0Row2, 0, 2);
        gridPane.add(col1Row0, 1, 0);
        gridPane.add(col1Row1, 1, 1);
        gridPane.add(col1Row2, 1, 2);
        gridPane.add(col2Row0, 2, 0);
        gridPane.add(col2Row1, 2, 1);
        gridPane.add(col2Row2, 2, 2);
    }

    public void loadGridPane() {
        gridPane.getColumnConstraints().addAll(col0, col1, col2);
        gridPane.getRowConstraints().addAll(row0, row1, row2);
        gridPane.getAlignment();
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setBackground(background);
    }

}
