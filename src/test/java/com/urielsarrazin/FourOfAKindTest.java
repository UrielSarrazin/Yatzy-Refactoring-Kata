package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class FourOfAKindTest {

    @Test
    public void testFourOfAKind() {
        areEqual(12, new FourOfAKind(3, 3, 3, 3, 5).score());
        areEqual(20, new FourOfAKind(5, 5, 5, 4, 5).score());
        areEqual(0, new FourOfAKind(5, 5, 5, 4, 3).score());
    }
}
