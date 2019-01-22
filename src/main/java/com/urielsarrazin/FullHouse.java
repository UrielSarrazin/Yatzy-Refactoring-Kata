package com.urielsarrazin;

public class FullHouse extends Roll {

    public FullHouse(int... dices) {
        super(dices);
    }

    public int score() {
        boolean _2 = false;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        for (int i = 0; i <= NB_OF_DICES; i++)
            if (getOccurencesByKind(i + 1) == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (int i = 0; i <= NB_OF_DICES; i += 1)
            if (getOccurencesByKind(i + 1) == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }
}
