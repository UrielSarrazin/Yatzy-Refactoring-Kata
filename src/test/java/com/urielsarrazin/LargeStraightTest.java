package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class LargeStraightTest {

    @Test
    public void testSmallStraight() {
        areEqual(15, new SmallStraight(1, 2, 3, 4, 5).score());
        areEqual(15, new SmallStraight(2, 3, 4, 5, 1).score());
        areEqual(0, new SmallStraight(1, 2, 2, 4, 5).score());
    }
}
