package com.urielsarrazin;

public class Ones extends Roll {

    public Ones(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(1);
    }
}
