package com.urielsarrazin;

public class Threes extends FiveOfAKind {

    public Threes(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(3);
    }
}
