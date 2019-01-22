package com.urielsarrazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourOfAKindTest {

    @Test
    public void testFourOfAKind() {
        assertEquals(12, new FourOfAKind(3, 3, 3, 3, 5).score());
        assertEquals(20, new FourOfAKind(5, 5, 5, 4, 5).score());
    }
}
