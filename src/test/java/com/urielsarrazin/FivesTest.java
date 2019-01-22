package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FivesTest {

    @Test
    public void testFives() {
        assertEquals(10, new Fives(4, 4, 4, 5, 5).score());
        assertEquals(15, new Fives(4, 4, 5, 5, 5).score());
        assertEquals(20, new Fives(4, 5, 5, 5, 5).score());
    }

}
