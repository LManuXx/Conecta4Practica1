package com.company;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Coordinates {
    public static final int COLUMNS =7;
    public static final int ROWS = 6;
    private int selectedRow;


    Coordinates() {
    this.selectedRow = getSelectedRow();
    }

    public static int getColumns() {
        return Coordinates.COLUMNS;
    }


    public static int getRows() {
        return Coordinates.ROWS;
    }

    public String getErrorMessage(){
        return Error.WRONG_COORDINATES.toString();
    }

    public int getSelectedRow(){
        selectedRow = Console.getInstance().readInt(Message.TOKEN_COORDINATE.toString());
        return selectedRow;
    }


}
