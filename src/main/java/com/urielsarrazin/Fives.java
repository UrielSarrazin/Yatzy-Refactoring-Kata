package com.urielsarrazin;

public class Fives extends Roll {

    public Fives(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(5);
    }
}
