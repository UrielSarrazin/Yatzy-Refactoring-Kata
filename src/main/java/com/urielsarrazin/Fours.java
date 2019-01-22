package com.urielsarrazin;

public class Fours extends FiveOfAKind {

    public Fours(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(4);
    }
}
