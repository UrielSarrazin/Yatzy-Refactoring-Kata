package com.urielsarrazin;

import org.junit.Test;

public class RollTest {

    @Test(expected = RollException.class)
    public void testRollException() {
        new Yatzy();
    }
}
