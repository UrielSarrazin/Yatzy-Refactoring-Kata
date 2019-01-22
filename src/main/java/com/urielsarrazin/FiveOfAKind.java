package com.urielsarrazin;

public abstract class FiveOfAKind extends Roll {

    public FiveOfAKind(int... dices) {
        super(dices);
    }

    protected int fiveOfAKind(int kind) {
        return getOccurencesByKind(kind) * kind;
    }
}
