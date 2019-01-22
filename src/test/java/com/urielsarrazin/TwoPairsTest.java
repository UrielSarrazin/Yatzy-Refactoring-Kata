package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class TwoPairsTest {

    @Test
    public void testTwoPairs() {
        areEqual(16, new TwoPairs(3, 3, 5, 4, 5).score());
        areEqual(16, new TwoPairs(3, 3, 5, 5, 5).score());
        areEqual(0, new TwoPairs(3, 3, 5, 2, 4).score());
    }
}
