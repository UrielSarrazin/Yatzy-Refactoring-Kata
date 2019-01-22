package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreesTest {

    @Test
    public void testThrees() {
        assertEquals(6, new Threes(1, 2, 3, 2, 3).score());
        assertEquals(12, new Threes(2, 3, 3, 3, 3).score());
    }
}
