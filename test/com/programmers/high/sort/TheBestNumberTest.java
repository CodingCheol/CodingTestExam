package com.programmers.high.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheBestNumberTest {

    //[6, 10, 2]	6210
    //    [3, 30, 34, 5, 9]	9534330
    @Test
    void solution() {
        Assertions.assertEquals(new TheBestNumber().solution(new int[]{40,400}),"40400");
        Assertions.assertEquals(new TheBestNumber().solution(new int[]{40, 403}),"40403");
        Assertions.assertEquals(new TheBestNumber().solution(new int[]{3,30,34,5,9}),"9534330");
        Assertions.assertEquals(new TheBestNumber().solution(new int[]{6,10,2}),"6210");
    }
}