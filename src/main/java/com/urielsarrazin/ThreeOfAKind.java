package com.urielsarrazin;

public class ThreeOfAKind extends NOfAKind {

    public ThreeOfAKind(int... dices) {
        super(dices);
    }

    public int score() {
        return nOfAKind(3);
    }
}
