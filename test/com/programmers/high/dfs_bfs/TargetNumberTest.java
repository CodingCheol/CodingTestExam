package com.programmers.high.dfs_bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
입출력 예
  numbers	target	return
 [1, 1, 1, 1, 1]	3	5
*/
class TargetNumberTest {

@Test
void solution() {
  Assertions.assertEquals(5,new TargetNumber().solution(new int[]{1, 1, 1, 1, 1},3));
}
}
