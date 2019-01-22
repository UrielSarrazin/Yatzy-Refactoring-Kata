package com.urielsarrazin;

public class TwoPairs extends Roll {

    public TwoPairs(int... dices) {
        super(dices);
    }

    public int score() {
        int n = 0;
        int score = 0;
        for (int i = 0; i <= NB_OF_DICES; i += 1)
            if (getOccurencesByKind(6 - i) >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }
}
