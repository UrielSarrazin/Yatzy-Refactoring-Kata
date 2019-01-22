package com.urielsarrazin;

public class FourOfAKind extends NOfAKind {

    public FourOfAKind(int... dices) {
        super(dices);
    }

    public int score() {
        return nOfAKind(4);
    }
}
