package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;
import static org.junit.Assert.assertEquals;

public class YatzyTest {

    @Test
    public void testYatzy() {
        areEqual(50, new Yatzy(4, 4, 4, 4, 4).score());
        areEqual(50, new Yatzy(6, 6, 6, 6, 6).score());
        areEqual(0, new Yatzy(6, 6, 6, 6, 3).score());
    }
}
