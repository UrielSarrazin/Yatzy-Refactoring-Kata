package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullHouseTest {

    @Test
    public void testFullHouse() {
        assertEquals(18, new FullHouse(6, 2, 2, 2, 6).score());
        assertEquals(0, new FullHouse(2, 3, 4, 5, 6).score());
    }
}
