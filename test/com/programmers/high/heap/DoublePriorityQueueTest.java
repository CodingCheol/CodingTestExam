package com.programmers.high.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublePriorityQueueTest {

    //      [I 16,D 1]	[0,0]
    //      [I 7,I 5,I -5,D -1]	[7,5]
    //[I 1, I 2, I 3, I 4, I 5, I 6, I 7, I 8, I 9, I 10, D 1, D -1, D 1, D -1, I 1, I 2, I 3, I 4, I 5, I 6, I 7, I 8, I 9, I 10, D 1, D -1, D 1, D -1]

    @Test
    void solution() {
        Assertions.assertArrayEquals(new DoublePriorityQueue().solution(new String[]{"I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1", "I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1"}),new int[]{8,3});
        Assertions.assertArrayEquals(new DoublePriorityQueue().solution(new String[]{"I 7","I 5","I -5","D -1"}),new int[]{7,5});
        Assertions.assertArrayEquals(new DoublePriorityQueue().solution(new String[]{"I 16","D 1"}),new int[]{0,0});
    }
}