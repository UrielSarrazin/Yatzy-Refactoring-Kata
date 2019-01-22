package com.urielsarrazin;

public class Sixes extends Roll {

    public Sixes(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(6);
    }
}
