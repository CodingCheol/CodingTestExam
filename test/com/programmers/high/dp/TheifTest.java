package com.programmers.high.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheifTest {

    @Test
    void solution() {
    // [1, 2, 3, 1] 4

        Assertions.assertEquals(new Theif().solution(new int[]{1,2,3,1}),4);
    }
}