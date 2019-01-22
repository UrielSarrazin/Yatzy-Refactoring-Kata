package com.urielsarrazin;

public class TwoPairs extends Pair {

    public TwoPairs(int... dices) {
        super(dices);
    }

    public int score() {
        return score(2);
    }
}
