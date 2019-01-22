package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void testChance() {
        assertEquals(15, new Chance(2, 3, 4, 5, 1).score());
        assertEquals(16, new Chance(3, 3, 4, 5, 1).score());
    }
}
