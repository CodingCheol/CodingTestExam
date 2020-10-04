package com.programmers.high.stack_queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDevelopTest {
    @Test
    void solution() {
        Assertions.assertArrayEquals(new FunctionDevelop().solution(new int[]{40, 93, 30, 55, 60, 65},new int[]{60, 1, 30, 5 , 10, 7}),new int[]{1,2,3});
        Assertions.assertArrayEquals(new FunctionDevelop().solution(new int[]{99, 1},new int[]{1, 99}),new int[]{2});
        Assertions.assertArrayEquals(new FunctionDevelop().solution(new int[]{93, 30, 55},new int[]{1, 30, 5}),new int[]{2, 1});
        Assertions.assertArrayEquals(new FunctionDevelop().solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1}),new int[]{1, 3, 2});
    }
}