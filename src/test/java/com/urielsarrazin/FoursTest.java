package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoursTest {

    @Test
    public void testFours() {
        assertEquals(12, new Fours(4, 4, 4, 5, 5).score());
        assertEquals(8, new Fours(4, 4, 5, 5, 5).score());
        assertEquals(4, new Fours(4, 5, 5, 5, 5).score());
    }
}
