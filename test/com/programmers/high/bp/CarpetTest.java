package com.programmers.high.bp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {

    /*
    *
    10	2	[4, 3]
    8	1	[3, 3]
    24	24	[8, 6]
    * */
    @Test
    void solution() {
        Assertions.assertArrayEquals(new Carpet().solution(10,2),new int[]{4,3});
        Assertions.assertArrayEquals(new Carpet().solution(8,1),new int[]{3,3});
        Assertions.assertArrayEquals(new Carpet().solution(24,24),new int[]{8,6});
    }
}