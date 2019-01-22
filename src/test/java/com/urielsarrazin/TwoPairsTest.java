package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoPairsTest {

    @Test
    public void testTwoPairs() {
        assertEquals(16, new TwoPairs(3, 3, 5, 4, 5).score());
        assertEquals(16, new TwoPairs(3, 3, 5, 5, 5).score());
        assertEquals(0, new TwoPairs(3, 3, 5, 2, 4).score());
    }
}
