package com.programmers.high.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolRoadTest {

    @Test
    void solution() {
    // 4	3	[[2, 2]]	4

        Assertions.assertEquals(new SchoolRoad().solution(4,3,new int[][]{{2,2}}),4);
    }
}