package com.urielsarrazin;

public class LargeStraight extends Roll {

    public LargeStraight(int... dices) {
        super(dices);
    }

    public int score() {
        if (getOccurencesByKind(2) == 1 &&
                getOccurencesByKind(3) == 1 &&
                getOccurencesByKind(4) == 1 &&
                getOccurencesByKind(5) == 1
                && getOccurencesByKind(5) == 1)
            return 20;
        return 0;
    }
}
