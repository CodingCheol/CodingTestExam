package com.programmers.high.greed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakingIslandTest {

    //n = 4
    //costs = [[0,1,1],[0,2,2],[2,3,1]]
    //return = 4
    @Test
    void solution() {
        Assertions.assertEquals(new MakingIsland().solution(5, new int[][]{{0,1,5},{1,2,3},{2,3,3},{3,1,2},{3,0,4},{2,4,6},{4,0,7}}),15);
        Assertions.assertEquals(new MakingIsland().solution(5, new int[][]{{0,1,1},{0,2,2},{3,4,1},{2,3,6}}),10);
        Assertions.assertEquals(new MakingIsland().solution(4, new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}}),4);
    }
}