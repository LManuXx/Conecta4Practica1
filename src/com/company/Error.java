package com.company;

enum Error {
    NOT_SPACE("There isn't more squares in that position"),
    WRONG_COORDINATES("The coordinates doesn't exist in the board"),
    NULL;
    private String message;

    Error() {

    }

    Error(String message) {
        this.message = message;
    }

    public void writeLine() {
        if (this != null) {
            System.out.println(this.message);
        }

    }

    public boolean isNull() {
        return this == Error.NULL;
    }


}
