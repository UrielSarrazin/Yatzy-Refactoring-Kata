package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwosTest {

    @Test
    public void testTwos() {
        assertEquals(4, new Twos(1, 2, 3, 2, 6).score());
        assertEquals(10, new Twos(2, 2, 2, 2, 2).score());
    }
}
