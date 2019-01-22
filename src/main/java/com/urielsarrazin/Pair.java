package com.urielsarrazin;

public abstract class Pair extends Roll {

    public Pair(int... dices) {
        super(dices);
    }

    protected int score(int expectedNumberOfPairs) {
        int pairsFound = 0;
        int score = 0;
        for (int i = 0; i <= NB_OF_DICES; i++)
            if (getOccurencesByKind(6 - i) >= 2) {
                pairsFound++;
                score += (6 - i);
                if(pairsFound >= expectedNumberOfPairs)
                    break;
            }
        if (pairsFound >= expectedNumberOfPairs)
            return score * 2;
        else
            return 0;
    }
}
