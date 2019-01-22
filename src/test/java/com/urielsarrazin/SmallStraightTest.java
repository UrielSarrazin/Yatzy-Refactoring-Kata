package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallStraightTest {

    @Test
    public void testLargeStraight() {
        assertEquals(20, new LargeStraight(6, 2, 3, 4, 5).score());
        assertEquals(20, new LargeStraight(2, 3, 4, 5, 6).score());
        assertEquals(0, new LargeStraight(1, 2, 2, 4, 5).score());
    }
}
