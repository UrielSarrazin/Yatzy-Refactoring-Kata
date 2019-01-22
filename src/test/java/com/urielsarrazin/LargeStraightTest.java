package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeStraightTest {

    @Test
    public void testSmallStraight() {
        assertEquals(15, new SmallStraight(1, 2, 3, 4, 5).score());
        assertEquals(15, new SmallStraight(2, 3, 4, 5, 1).score());
        assertEquals(0, new SmallStraight(1, 2, 2, 4, 5).score());
    }
}
