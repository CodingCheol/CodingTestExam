package com.programmers.high.greed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GymSuitTest {

    @Test
    void solution() {

        Assertions.assertEquals(5,new GymSuit().solution(5,new int[]{2,4},new int[]{1,3,5}));
        Assertions.assertEquals(4,new GymSuit().solution(5,new int[]{2,4},new int[]{3}));
        Assertions.assertEquals(2,new GymSuit().solution(3,new int[]{3},new int[]{1}));
        Assertions.assertEquals(9,new GymSuit().solution(10,new int[]{3,9,10},new int[]{3,8,9}));
    }
}
