package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnePairTest {

    @Test
    public void testOnePair() {
        assertEquals(6, new OnePair(3, 4, 3, 5, 6).score());
        assertEquals(10, new OnePair(5, 3, 3, 3, 5).score());
        assertEquals(12, new OnePair(5, 3, 6, 6, 5).score());
        assertEquals(0, new OnePair(1, 2, 3, 4, 5).score());
    }
}
