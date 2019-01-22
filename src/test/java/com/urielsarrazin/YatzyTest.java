package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzyTest {

    @Test
    public void testYatzy() {
        assertEquals(50, new Yatzy(4, 4, 4, 4, 4).score());
        assertEquals(50, new Yatzy(6, 6, 6, 6, 6).score());
        assertEquals(0, new Yatzy(6, 6, 6, 6, 3).score());
    }
}
