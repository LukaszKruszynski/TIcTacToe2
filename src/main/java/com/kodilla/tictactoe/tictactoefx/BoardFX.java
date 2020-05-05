package com.kodilla.tictactoe.tictactoefx;

import com.kodilla.tictactoe.tictactoefx.figuresfx.NoneFigure;
import com.kodilla.tictactoe.tictactoefx.figuresfx.OFigure;
import com.kodilla.tictactoe.tictactoefx.figuresfx.XFigure;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoardFX {
    public GridPane gridPane = new GridPane();
    NoneFigure noneFigure = new NoneFigure();
    private Image imageNoneShape = noneFigure.getImageNoneShape();
    OFigure oFigure = new OFigure();
    XFigure xFigure = new XFigure();

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

    public List listBoard() {
        ArrayList<ImageView> listOfFigures = new ArrayList<>();
        listOfFigures.add(col0Row0);
        listOfFigures.add(col0Row1);
        listOfFigures.add(col0Row2);
        listOfFigures.add(col1Row0);
        listOfFigures.add(col1Row1);
        listOfFigures.add(col1Row2);
        listOfFigures.add(col2Row0);
        listOfFigures.add(col2Row1);
        listOfFigures.add(col2Row2);

        return listOfFigures;
    }

    public void setFigure() {
        XFigure xFigure = new XFigure();
        Image imageXShape = xFigure.getImageXShape();
        OFigure oFigure = new OFigure();
        Image imageOShape = oFigure.getImageOShape();
        if (col0Row0.getImage().equals(imageNoneShape)) {
            col0Row0.setOnMouseClicked(setXCol0Row0 -> col0Row0.setImage(imageXShape));
        }
        if (col0Row1.getImage().equals(imageNoneShape)) {
            col0Row1.setOnMouseClicked(setXCol0Row0 -> col0Row1.setImage(imageXShape));
        }
        if (col0Row2.getImage().equals(imageNoneShape)) {
            col0Row2.setOnMouseClicked(setXCol0Row0 -> col0Row2.setImage(imageXShape));
        }
        if (col1Row0.getImage().equals(imageNoneShape)) {
            col1Row0.setOnMouseClicked(setXCol0Row0 -> col1Row0.setImage(imageXShape));
        }
        if (col1Row1.getImage().equals(imageNoneShape)) {
            col1Row1.setOnMouseClicked(setXCol0Row0 -> col1Row1.setImage(imageXShape));
        }
        if (col1Row2.getImage().equals(imageNoneShape)) {
            col1Row2.setOnMouseClicked(setXCol0Row0 -> col1Row2.setImage(imageXShape));
        }
        if (col2Row0.getImage().equals(imageNoneShape)) {
            col2Row0.setOnMouseClicked(setXCol0Row0 -> col2Row0.setImage(imageXShape));
        }
        if (col2Row1.getImage().equals(imageNoneShape)) {
            col2Row1.setOnMouseClicked(setXCol0Row0 -> col2Row1.setImage(imageXShape));
        }
        if (col2Row2.getImage().equals(imageNoneShape)) {
            col2Row2.setOnMouseClicked(setXCol0Row0 -> col2Row2.setImage(imageXShape));
        }
    }

    public void setOFigureRandom() {
        Random random = new Random();
        int randomInt = random.nextInt(9) + 1;
        System.out.println(randomInt);
        switch (randomInt) {
            case 1:
                col0Row0.setImage(oFigure.getImageOShape());
                break;
            case 2:
                col0Row1.setImage(oFigure.getImageOShape());
                break;
            case 3:
                col0Row2.setImage(oFigure.getImageOShape());
                break;
            case 4:
                col1Row0.setImage(oFigure.getImageOShape());
                break;
            case 5:
                col1Row1.setImage(oFigure.getImageOShape());
                break;
            case 6:
                col1Row2.setImage(oFigure.getImageOShape());
                break;
            case 7:
                col2Row0.setImage(oFigure.getImageOShape());
                break;
            case 8:
                col2Row1.setImage(oFigure.getImageOShape());
                break;
            case 9:
                col2Row2.setImage(oFigure.getImageOShape());
                break;
            default:
                break;

        }
    }
}
