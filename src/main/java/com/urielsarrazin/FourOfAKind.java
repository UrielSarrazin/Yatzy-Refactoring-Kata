package com.urielsarrazin;

public class FourOfAKind extends Roll {

    public FourOfAKind(int... dices) {
        super(dices);
    }

    public int score() {
        return nOfAKind(4);
    }
}
