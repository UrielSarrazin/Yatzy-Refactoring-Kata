package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class ThreesTest {

    @Test
    public void testThrees() {
        areEqual(6, new Threes(1, 2, 3, 2, 3).score());
        areEqual(12, new Threes(2, 3, 3, 3, 3).score());
    }
}
