package com.urielsarrazin;

public class Yatzy {

    private static final int NB_DICES = 5;

    private int[] kindCardinalities;

    public Yatzy(int ... dices) {
        kindCardinalities = new int[6];
        for (int dice : dices)
            kindCardinalities[dice - 1]++;
    }

    public int chance() {
        int total = 0;
        for (int i = 0; i <= NB_DICES; i++)
            total += (i + 1) * kindCardinalities[i];
        return total;
    }

    public int yatzy() {
        for (int i = 0; i <= NB_DICES; i++)
            if (kindCardinalities[i] == NB_DICES)
                return 50;
        return 0;
    }

    public int fourOfAKind() {
        return nOfAKind(4);
    }

    public int threeOfAKind() {
        return nOfAKind(3);
    }

    private int nOfAKind(int kind) {
        for (int i = 0; i <= NB_DICES; i++)
            if (kindCardinalities[i] >= kind)
                return (i + 1) * kind;
        return 0;
    }

    public int onePair() {
        for (int i = 0; i <= NB_DICES; i++)
            if (kindCardinalities[6 - i - 1] >= 2)
                return (6 - i) * 2;
        return 0;
    }

    public int twoPair() {
        int n = 0;
        int score = 0;
        for (int i = 0; i <= NB_DICES; i += 1)
            if (kindCardinalities[6 - i - 1] >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public int smallStraight() {
        if (kindCardinalities[0] == 1 &&
                kindCardinalities[1] == 1 &&
                kindCardinalities[2] == 1 &&
                kindCardinalities[3] == 1 &&
                kindCardinalities[4] == 1)
            return 15;
        return 0;
    }

    public int largeStraight() {
        if (kindCardinalities[1] == 1 &&
                kindCardinalities[2] == 1 &&
                kindCardinalities[3] == 1 &&
                kindCardinalities[4] == 1
                && kindCardinalities[5] == 1)
            return 20;
        return 0;
    }

    public int fullHouse() {
        boolean _2 = false;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        for (int i = 0; i <= NB_DICES; i++)
            if (kindCardinalities[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (int i = 0; i <= NB_DICES; i += 1)
            if (kindCardinalities[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }

    public int ones() {
        return fiveOfAKind(1);
    }

    public int twos() {
        return fiveOfAKind(2);
    }

    public int threes() {
        return fiveOfAKind(3);
    }

    public int fours() {
        return fiveOfAKind(4);
    }

    public int fives() {
        return fiveOfAKind(5);
    }

    public int sixes() {
        return fiveOfAKind(6);
    }

    private int fiveOfAKind(int kind) {
        return kindCardinalities[kind -1] * kind;
    }
}
