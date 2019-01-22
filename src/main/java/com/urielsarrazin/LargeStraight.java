package com.urielsarrazin;

public class LargeStraight extends Straight {

    private static final int[] LARGE_STRAIGHT = { 2, 3, 4, 5, 6 };

    public LargeStraight(int... dices) {
        super(dices);
    }

    public int score() {
        return occurOnce(LARGE_STRAIGHT) ? 20 : 0;
    }
}
