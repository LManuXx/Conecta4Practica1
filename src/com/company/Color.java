package com.company;

enum Color {
    X,
    O,
    NULL;

    public static Color getColor(int i){
        Color color;
        if(i == 0){
            color = O;
        }else{
            color = X;
        }
        return color;
    }
}
