package com.programmers.high.greed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnforceCameraTest {

    @Test
    void solution() {
        Assertions.assertEquals(new EnforceCamera().solution(new int[][]{ {-20,15}, {-14,-5}, {-18,-13}, {-5,-3}}),2);
    }
}