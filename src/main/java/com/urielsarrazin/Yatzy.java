package com.urielsarrazin;

public class Yatzy extends Roll {

    public Yatzy(int... dices) {
        super(dices);
    }

    public int score() {
        for (int i = 0; i <= NB_OF_DICES; i++)
            if (getOccurencesByKind(i + 1) == NB_OF_DICES)
                return 50;
        return 0;
    }
}
