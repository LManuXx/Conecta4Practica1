package com.company;

public class Turn {
    private Board board;
    private Player[] players;
    private int activePlayer;
    static final int NUMBER_PLAYERS = 2;

    Turn(Board board){
        assert board != null;
        this.board = board;
        this.players = new Player[Turn.NUMBER_PLAYERS];
        this.reset();
    }

    public void reset(){
        for(int i = 0; i < NUMBER_PLAYERS; i++){
            this.players[i] = new Player();
        }
        this.activePlayer = 0;
    }


}
