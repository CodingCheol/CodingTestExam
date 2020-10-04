package com.programmers.high.stack_queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void solution() {
        Assertions.assertArrayEquals(new Stock().solution(new int[]{1, 2, 3, 2, 3}),new int[]{4, 3, 1, 1, 0});
    }
}