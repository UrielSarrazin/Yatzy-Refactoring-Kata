package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class FullHouseTest {

    @Test
    public void testFullHouse() {
        areEqual(18, new FullHouse(6, 2, 2, 2, 6).score());
        areEqual(0, new FullHouse(2, 3, 4, 5, 6).score());
    }
}
