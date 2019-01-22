package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class OnePairTest {

    @Test
    public void testOnePair() {
        areEqual(6, new OnePair(3, 4, 3, 5, 6).score());
        areEqual(10, new OnePair(5, 3, 3, 3, 5).score());
        areEqual(12, new OnePair(5, 3, 6, 6, 5).score());
        areEqual(0, new OnePair(1, 2, 3, 4, 5).score());
    }
}
