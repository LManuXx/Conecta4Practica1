package com.company;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Coordinates {
    public static final int COLUMNS = 7;
    public static final int ROWS = 6;
    private int row;
    private int column;
    private int selectedRow;


    Coordinates(int row, int column) {
        this.row = row;
        this.column = column;
    }


    public static boolean isOutOfLimits(int column) {
        return column < 0 || column >= Coordinates.COLUMNS;
    }


    public int getPositionColumn() {
        return column;
    }

    public int getPositionRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }


}
