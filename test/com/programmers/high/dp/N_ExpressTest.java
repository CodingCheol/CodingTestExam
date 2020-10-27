package com.programmers.high.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class N_ExpressTest {

    // 5	12	4
    //    2	11	3
    //N : 5, number : 83, Return 8 // (55+5) + 5*5 - (5+5)/5
    //N : 5, number : 87, Return 7 // (555+5)/5 - 5*5
    //N : 5, number : 127, Return 6 // 555 + (5+5)/5
    @Test
    void solution() {
        Assertions.assertEquals(new N_Express0ver().solution(5, 127),6);
        Assertions.assertEquals(new N_Express0ver().solution(5, 23),5);
        Assertions.assertEquals(new N_Express0ver().solution(5, 87),7);
        Assertions.assertEquals(new N_Express0ver().solution(5, 83),8);

        Assertions.assertEquals(new N_Express0ver().solution(5, 31168),-1);
        Assertions.assertEquals(new N_Express0ver().solution(5,12),4);
        Assertions.assertEquals(new N_Express0ver().solution(2,11),3);
    }
}