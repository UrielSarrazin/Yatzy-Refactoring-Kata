package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnesTest {

    @Test
    public void testOnes() {
        assertEquals(1, new Ones(1, 2, 3, 4, 5).score());
        assertEquals(2, new Ones(1, 2, 1, 4, 5).score());
        assertEquals(0, new Ones(6, 2, 2, 4, 5).score());
        assertEquals(4, new Ones(1, 2, 1, 1, 1).score());
    }
}
