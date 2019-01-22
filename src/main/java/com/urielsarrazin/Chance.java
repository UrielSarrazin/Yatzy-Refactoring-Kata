package com.urielsarrazin;

public class Chance extends Roll {

    public Chance(int... dices) {
        super(dices);
    }

    public int score() {
        int total = 0;
        for (int i = 0; i <= NB_OF_DICES; i++)
            total += (i + 1) * getOccurencesByKind(i + 1);
        return total;
    }
}
