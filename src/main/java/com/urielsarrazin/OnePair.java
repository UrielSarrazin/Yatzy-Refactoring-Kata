package com.urielsarrazin;

public class OnePair extends Roll {

    public OnePair(int... dices) {
        super(dices);
    }

    public int score() {
        for (int i = 0; i <= NB_OF_DICES; i++)
            if (getOccurencesByKind(6 - i) >= 2)
                return (6 - i) * 2;
        return 0;
    }
}
