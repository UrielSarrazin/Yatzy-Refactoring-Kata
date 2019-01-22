package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SixiesRollTest {

    @Test
    public void testSixes() {
        assertEquals(0, new Sixes(4, 4, 4, 5, 5).score());
        assertEquals(6, new Sixes(4, 4, 6, 5, 5).score());
        assertEquals(18, new Sixes(6, 5, 6, 6, 5).score());
    }
}
