package com.urielsarrazin;

public class Fives extends FiveOfAKind {

    public Fives(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(5);
    }
}
