package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class SmallStraightTest {

    @Test
    public void testLargeStraight() {
        areEqual(20, new LargeStraight(6, 2, 3, 4, 5).score());
        areEqual(20, new LargeStraight(2, 3, 4, 5, 6).score());
        areEqual(0, new LargeStraight(1, 2, 2, 4, 5).score());
    }
}
