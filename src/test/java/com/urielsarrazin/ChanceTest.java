package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class ChanceTest {

    @Test
    public void testChance() {
        areEqual(15, new Chance(2, 3, 4, 5, 1).score());
        areEqual(16, new Chance(3, 3, 4, 5, 1).score());
    }
}
