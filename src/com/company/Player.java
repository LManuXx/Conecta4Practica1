package com.company;

public class Player {
    private Color color;
    private Board board;
    private int putTokens;

    Player(Color color, Board board) {
        this.color = color;
        this.board = board;
        this.putTokens = 0;

    }

    public void play() {
        int column;
        Error error;
        do {
            column = Console.getInstance().readInt("Introduce column: ");
            error = this.getPlayError(column);
        } while (!error.isNull());
        board.putToken(column, this.color);
    }

    private Error getPlayError(int column) {
        Error error = Error.NULL;
        if (Coordinates.isOutOfBounds(column)) {
            error = Error.WRONG_COORDINATES;
        } else if (this.board.columnIsFree(column)) {
            error = Error.NOT_SPACE;
        }
        error.writeLine();
        return error;
    }

    public void writeWinner() {
        Message.VICTORY.toString();
    }

    public Color getPlayerColor() {
        return color;
    }

    /*public void setPlayerColor(Color playerColor){
        this.color = playerColor;
    }*/
}
