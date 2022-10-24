package com.company;

public class Board {
    private Color[][] colors;

    public Board() {
        this.colors = new Color[Coordinates.ROWS][Coordinates.COLUMNS];
        this.reset();
    }

    public void reset() {
        for (int i = 0; i < Coordinates.ROWS; i++) {
            for (int j = 0; j < Coordinates.COLUMNS; j++) {
                this.colors[i][j] = Color.NULL;
            }
        }
    }

    public void putToken(int column, Color tokenColor) {
        Coordinates coordinate = new Coordinates(0, column);
        while (keptSquare(coordinate)) {
            coordinate.setRow(coordinate.getPositionRow() + 1);
        }
        setColors(coordinate, tokenColor);

    }

    public void setColors(Coordinates coordinate, Color color) {
        this.colors[coordinate.getPositionRow()][coordinate.getPositionColumn()] = color;
    }

    public boolean keptSquare(Coordinates coordinate) {
        return !colors[coordinate.getPositionRow()][coordinate.getPositionColumn()].isNull();
    }

    public boolean isFull() {
        int emptyPositions = Coordinates.COLUMNS;
        for (int i = 0; i < Coordinates.COLUMNS; i++) {
            if (this.freeColumn(i)) {
                emptyPositions--;
            }
        }
        return emptyPositions > 0;
    }

    public boolean freeColumn(int column) {
        return !this.colors[Coordinates.ROWS - 1][column].isNull();
    }

    public void show() {
        for (int i = Coordinates.ROWS - 1; i >= 0; i--) {
            for (int j = 0; j < Coordinates.COLUMNS; j++) {
                if (this.colors[i][j].isNull()) {
                    System.out.print("|\t \t");
                } else {
                    System.out.print("|\t" + this.colors[i][j] + "\t");
                }
            }
            System.out.print("|\n");
        }
        System.out.println();
    }

}
