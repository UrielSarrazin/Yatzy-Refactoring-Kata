package com.urielsarrazin;

import org.junit.Test;

import static com.urielsarrazin.Assert.areEqual;

public class ThreeOfAKindTest {

    @Test
    public void testThreeOfAKind() {
        areEqual(9, new ThreeOfAKind(3, 3, 3, 4, 5).score());
        areEqual(15, new ThreeOfAKind(5, 3, 5, 4, 5).score());
        areEqual(9, new ThreeOfAKind(3, 3, 3, 3, 5).score());
        areEqual(9, new ThreeOfAKind(3, 3, 3, 3, 3).score());
    }
}
