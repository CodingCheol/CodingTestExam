package com.programmers.high.stack_queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {
//[2, 1, 3, 2]	2	1
//    [2, 1, 3, 2]	0	1
//    [1, 1, 9, 1, 1, 1]	0	5
    @Test
    void solution() {
        Assertions.assertEquals(new Print().solution(new int[]{2, 1, 3, 2},2),1);
        Assertions.assertEquals(new Print().solution(new int[]{1, 1, 9, 1, 1, 1},0),5);
    }
}