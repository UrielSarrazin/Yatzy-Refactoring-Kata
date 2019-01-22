package com.urielsarrazin;

public abstract class Straight extends Roll {

    public Straight(int... dices) {
        super(dices);
    }

    protected boolean occurOnce(int[] values) {
        for (int value : values)
            if(!occursOnce(value))
                return false;
        return true;
    }

    private boolean occursOnce(int value) {
        return getOccurencesByKind(value) == 1;
    }
}
