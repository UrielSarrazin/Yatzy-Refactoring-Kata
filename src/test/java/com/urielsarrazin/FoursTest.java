package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class FoursTest {

    @Test
    public void testFours() {
        areEqual(12, new Fours(4, 4, 4, 5, 5).score());
        areEqual(8, new Fours(4, 4, 5, 5, 5).score());
        areEqual(4, new Fours(4, 5, 5, 5, 5).score());
    }
}
