package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class FivesTest {

    @Test
    public void testFives() {
        areEqual(10, new Fives(4, 4, 4, 5, 5).score());
        areEqual(15, new Fives(4, 4, 5, 5, 5).score());
        areEqual(20, new Fives(4, 5, 5, 5, 5).score());
    }
}
