package com.programmers.high.greed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
입출력 예
people	           limit	return
[70, 50, 80, 50]	100	       3
[70, 80, 50]	    100	       3
[50,40,80,20,60,50] 100        3
[50,40, 80,20, 60,50 ,30,20 ,30,20] 100        3
[70,70,70,70,70]    100        5
*/
class LifeboatTest {

@Test
void solution() {
  Assertions.assertEquals(1,new Lifeboat().solution(new int[]{40},40));
  Assertions.assertEquals(2,new Lifeboat().solution(new int[]{40,40,40},100));
  Assertions.assertEquals(5,new Lifeboat().solution(new int[]{10,20,30,40,50,60,70,80,90},100));
  Assertions.assertEquals(5,new Lifeboat().solution(new int[]{50,40, 80,20, 60,50 ,30,20 ,30,20},100));
  Assertions.assertEquals(3,new Lifeboat().solution(new int[]{70, 80, 50},100));
  Assertions.assertEquals(3,new Lifeboat().solution(new int[]{70, 50, 80, 50},100));
  Assertions.assertEquals(5,new Lifeboat().solution(new int[]{70,70,70,70,70},100));
}
}
