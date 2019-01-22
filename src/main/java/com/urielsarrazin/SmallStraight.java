package com.urielsarrazin;

public class SmallStraight extends Roll {

    public SmallStraight(int... dices) {
        super(dices);
    }

    public int score() {
        if (getOccurencesByKind(1) == 1 &&
                getOccurencesByKind(2) == 1 &&
                getOccurencesByKind(3) == 1 &&
                getOccurencesByKind(4) == 1 &&
                getOccurencesByKind(5) == 1)
            return 15;
        return 0;
    }

}
