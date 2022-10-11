package com.company;

public class Cocecta4 {
    private Board board;
    private Turn turn;

    Cocecta4() {
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


}


