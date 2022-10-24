package com.company;

public class Conecta4 {
    private Board board = new Board();
    private Turn turn = new Turn(this.board);

    private void play() {

        do {
            this.playGame();
        } while (this.isResume());
    }

    private void playGame() {
        Message.TITLE.write();
        this.board.show();
        do {
            this.turn.play();
            this.board.show();
            Message.BARS.write();

        } while (board.isFull());
        this.turn.writeWinner();
    }

    private boolean isResume() {
        char opcion;
        boolean resume;
        do {

            opcion = Console.getInstance().readChar("Do you want to resume? S/N:");

            if (opcion != 's' || opcion != 'S') {
                resume = false;
            } else {
                resume = true;
            }
        } while (opcion != 's' || opcion != 'S' || opcion != 'n' || opcion != 'N');
        return resume;

    }

    public static void main(String[] args) {
        new Conecta4().play();
    }


}


