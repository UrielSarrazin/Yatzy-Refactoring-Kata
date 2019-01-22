package com.urielsarrazin;

public class Twos extends Roll {

    public Twos(int... dices) {
        super(dices);
    }

    public int score() {
        return fiveOfAKind(2);
    }
}
