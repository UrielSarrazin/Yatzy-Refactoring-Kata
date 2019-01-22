package com.urielsarrazin;

public class OnePair extends Pair {

    public OnePair(int... dices) {
        super(dices);
    }

    public int score() {
        return score(1);
    }
}
