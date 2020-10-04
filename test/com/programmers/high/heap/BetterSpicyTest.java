package com.programmers.high.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BetterSpicyTest {

    //[1, 2, 3, 9, 10, 12]	7	2
    @Test
    void solution() {
        Assertions.assertEquals(new BetterSpicy().solution(new int[]{1, 2, 3, 9, 10, 12},7),2);

    }
}