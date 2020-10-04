package com.programmers.high.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiskControllerTest {

    @Test
    void solution() {
        /*
        * [[0, 3], [4, 3], [8, 3]] 3
        [[0, 5], [6, 1], [6, 2]] 3
        [[0, 5], [6, 2], [6, 1]] 3
        [[0, 5], [2, 2], [5, 3]] 5
        [[0, 5], [2, 2], [4, 2]] 5
        * [[0,1],[0,1],[1,0]] -> 1
        * [0,1][1,2][500,6] -> 3
        * [[0, 10], [4, 10], [5, 11], [15, 2]] -> 15
        * [[2,0], [0,3]]
        * 0, 3], [1, 9], [500, 6]  6
        * [[0, 3], [1, 9], [2, 6]]	9
        * [[0, 10], [4, 10], [5, 11], [15, 2]] 15
        *  */
        //3 11 6 11 22+9 30 /4
        //[0, 10], [2,10], [15,2], [9,10]
        // [[0, 9], [0, 4], [0, 5], [0, 7], [0, 3]] 13

        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 10}, {2, 10}, {15, 2}, {9,10}}),14);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}}),13);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 10}, {4, 10}, {5, 11}, {15, 2}}),15);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 3}, {1, 9}, {500, 6}, {501, 6}}),7);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 3}, {1, 9}, {500, 6}}),6);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}),9);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 1}, {1, 2}, {500, 6}}),3);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 1}, {0, 1}, {1, 0}}),1);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 3}, {4, 3}, {8, 3}}),3);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 3}, {2, 6}, {1, 9}}),9);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 5}, {6, 1}, {6, 2}}),3);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 5}, {6, 2}, {6, 1}}),3);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 5}, {2,2}, {5, 3}}),5);
        Assertions.assertEquals(new DiskController().solution(new int[][]{{0, 5}, {2,2}, {4, 2}}),5);
    }
}