package com.urielsarrazin;

public abstract class Roll implements Scorable {

    protected static int NB_OF_DICES = 5;

    private int[] dicesValues;

    public Roll(int... dices) {
        this.dicesValues = dices;
        validate();
    }

    private void validate() {
        if(dicesValues.length != 5)
            throw new RollException(String.format("A roll must be composed of %d dices.", NB_OF_DICES));
    }

    protected int getOccurencesByKind(int kind) {
        int nbOfOccurences = 0;
        for (int diceValue : dicesValues)
            if (diceValue == kind)
                nbOfOccurences++;
        return nbOfOccurences;
    }
}
