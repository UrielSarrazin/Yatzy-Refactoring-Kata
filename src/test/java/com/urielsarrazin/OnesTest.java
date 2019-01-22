package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class OnesTest {

    @Test
    public void testOnes() {
        areEqual(1, new Ones(1, 2, 3, 4, 5).score());
        areEqual(2, new Ones(1, 2, 1, 4, 5).score());
        areEqual(0, new Ones(6, 2, 2, 4, 5).score());
        areEqual(4, new Ones(1, 2, 1, 1, 1).score());
    }
}
