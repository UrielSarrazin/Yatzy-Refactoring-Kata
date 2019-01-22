package com.urielsarrazin;

public class Sixes extends FiveOfAKind {

    public Sixes(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(6);
    }
}
