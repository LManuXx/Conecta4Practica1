package com.company;

public enum Color {
    X,
    O,
    NULL;

    public static Color getColor(int ordinal) {

        return Color.values()[ordinal];
    }

    public boolean isNull() {
        return this == Color.NULL;
    }
}
