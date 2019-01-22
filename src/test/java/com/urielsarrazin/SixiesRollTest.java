package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class SixiesRollTest {

    @Test
    public void testSixes() {
        areEqual(0, new Sixes(4, 4, 4, 5, 5).score());
        areEqual(6, new Sixes(4, 4, 6, 5, 5).score());
        areEqual(18, new Sixes(6, 5, 6, 6, 5).score());
    }
}
