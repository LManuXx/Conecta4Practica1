package com.company;

public class Board {
    private Color[][] colors;

    Board() {
        this.colors = new Color[Coordinates.getColumns()][Coordinates.getRows()];
        this.reset();
    }

    private void reset() {
        for (int i = 0; i < Coordinates.getColumns(); i++) {
            for (int j = 0; j < 6; j++) {
                this.colors[i][j] = null;
            }
        }
    }

    public void putToken() {
        //this.colors[][] =colors;
    }

    public boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < 7; i++) {
            if (!colors[i][0].equals('X') || !colors[i][0].equals('O')) {
                isFull = false;
            }
        }
        return isFull;
    }

    public void show() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(colors[i][j]);
            }
            System.out.print("\n");
        }
    }

}
