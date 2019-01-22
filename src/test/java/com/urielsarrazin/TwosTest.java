package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class TwosTest {

    @Test
    public void testTwos() {
        areEqual(4, new Twos(1, 2, 3, 2, 6).score());
        areEqual(10, new Twos(2, 2, 2, 2, 2).score());
    }
}
