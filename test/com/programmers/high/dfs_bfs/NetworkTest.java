package com.programmers.high.dfs_bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    입출력 예
    n	computers	return
    3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
    3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
    4 [[1,0,0,1],[0,1,1,1],[0,1,1,0],[1,1,0,1]] 1
*/
public class NetworkTest {
    @Test
    void solution() {

        Assertions.assertEquals(1,new Network().solution(4,new int[][]{{1,0,0,1},{0,1,1,1},{0,1,1,0},{1,1,0,1}}));
        Assertions.assertEquals(1,new Network().solution(3,new int[][]{{1, 1, 0},{1, 1, 1},{0, 1, 1}}));
        Assertions.assertEquals(2,new Network().solution(3,new int[][]{{1, 1, 0},{1, 1, 0},{0, 0, 1}}));
    }
}
