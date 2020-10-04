package com.programmers.high.stack_queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
/*    2	            10	    [7,4,5,6]	    8
    100	            100	    [10]	        101
    100	            100	    [10,10,10,10,10,10,10,10,10,10]	110
    5	5	[2, 2, 2, 2, 1, 1, 1, 1, 1]	19*/
    @Test
    void solution() {
        Assertions.assertEquals(new Truck().solution(2,10,new int[]{7,4,5,6}),8);
        Assertions.assertEquals(new Truck().solution(100,100,new int[]{10}),101);
        Assertions.assertEquals(new Truck().solution(100,100,new int[]{10,10,10,10,10,10,10,10,10,10}),110);
        Assertions.assertEquals(new Truck().solution(100,100,new int[]{10,10,10,10,10,10,10,10,10,10,10}),201);
    }
}