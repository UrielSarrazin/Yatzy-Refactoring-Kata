package com.urielsarrazin;

public class Yatzy {

    protected int[] dices;

    public Yatzy(int d1, int d2, int d3, int d4, int d5) {
        dices = new int[5];
        dices[0] = d1;
        dices[1] = d2;
        dices[2] = d3;
        dices[3] = d4;
        dices[4] = d5;
    }

    public int chance() {
        int total = 0;
        total += dices[0];
        total += dices[1];
        total += dices[2];
        total += dices[3];
        total += dices[4];
        return total;
    }

    public int yatzy() {
        int[] tallies = getTallies();
        for (int i = 0; i != 6; i++)
            if (tallies[i] == 5)
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
        int[] tallies = getTallies();
        for (int i = 0; i < 6; i++)
            if (tallies[i] >= kind)
                return (i + 1) * kind;
        return 0;
    }

    public int onePair() {
        int[] tallies = getTallies();
        int at;
        for (at = 0; at != 6; at++)
            if (tallies[6 - at - 1] >= 2)
                return (6 - at) * 2;
        return 0;
    }

    public int twoPair() {
        int[] tallies = getTallies();
        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (tallies[6 - i - 1] >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public int smallStraight() {
        int[] tallies = getTallies();
        if (tallies[0] == 1 &&
                tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1)
            return 15;
        return 0;
    }

    public int largeStraight() {
        int[] tallies = getTallies();
        if (tallies[1] == 1 &&
                tallies[2] == 1 &&
                tallies[3] == 1 &&
                tallies[4] == 1
                && tallies[5] == 1)
            return 20;
        return 0;
    }

    public int fullHouse() {
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        int[] tallies = getTallies();

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }

    private int[] getTallies() {
        int[] tallies = new int[6];
        for (int dice : dices)
            tallies[dice - 1]++;
        return tallies;
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
        int sum = 0;
        for (int i = 0; i < dices.length; i++)
            if (dices[i] == kind)
                sum += kind;
        return sum;
    }
}
