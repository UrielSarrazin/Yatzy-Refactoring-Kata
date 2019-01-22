package com.urielsarrazin;

public class Twos extends FiveOfAKind {

    public Twos(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(2);
    }
}
