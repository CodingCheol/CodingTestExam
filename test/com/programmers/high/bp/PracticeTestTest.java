package com.programmers.high.bp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTestTest {

    /*
    * [1,2,3,4,5]	[1]
    [1,3,2,4,2]	[1,2,3]
    */
    @Test
    void solution() {
        Assertions.assertArrayEquals(new PracticeTest().solution(new int[]{1,2,3,4,5}),new int[]{1});
        Assertions.assertArrayEquals(new PracticeTest().solution(new int[]{1,3,2,4,2}),new int[]{1,2,3});
    }
}