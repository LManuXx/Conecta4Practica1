package com.company;

public class Player {
    private Color color;
    private Board board;
    private int putTokens;

    Player(Color color, Board board) {
        this.color = color;
        this.board = this.board;
        this.putTokens = 0;

    }

    public void play(){
        if(this.putTokens < Coordinates.getColumns()){
            this.putTokens();
        }else{
            Error.WRONG_COORDINATES.toString();
        }
    }

    private void putTokens(){

    }
}
