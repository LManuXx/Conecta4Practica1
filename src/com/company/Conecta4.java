package com.company;

public class Conecta4 {
    private Board board;
    private Turn turn;

    Conecta4() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    private void play() {
        do {
            this.playGame();
        } while (this.isResume);
    }

    private void playGame() {
        Message.TITLE.write();
        this.board.show();
        do {
            this.turn.play();
            this.board.show();

        } while (board.isFull());
    }

    public static void main(String[] args) {

    }



}


