package com.urielsarrazin;

public abstract class Roll implements Scorable {

    protected static int NB_OF_DICES = 5;

    private int[] dicesValues;

    public Roll(int... dices) {
        this.dicesValues = dices;
    }

    protected int getOccurencesByKind(int kind) {
        int nbOfOccurences = 0;
        for (int diceValue : dicesValues)
            if (diceValue == kind)
                nbOfOccurences++;
        return nbOfOccurences;
    }

    protected int fiveOfAKind(int kind) {
        return getOccurencesByKind(kind) * kind;
    }

    protected int nOfAKind(int kind) {
        for (int i = 0; i <= NB_OF_DICES; i++)
            if (getOccurencesByKind(i + 1) >= kind)
                return (i + 1) * kind;
        return 0;
    }
}
