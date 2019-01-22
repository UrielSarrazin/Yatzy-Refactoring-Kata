package com.urielsarrazin;

public abstract class NOfAKind extends Roll {

    public NOfAKind(int... dices) {
        super(dices);
    }

    protected int nOfAKind(int kind) {
        for (int i = 0; i <= NB_OF_DICES; i++)
            if (getOccurencesByKind(i + 1) >= kind)
                return (i + 1) * kind;
        return 0;
    }
}
