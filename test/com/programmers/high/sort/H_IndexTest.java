package com.programmers.high.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class H_IndexTest {

    @Test
    void solution() {
        Assertions.assertEquals(new H_Index().solution(new int[]{3, 0, 6, 1, 5	}),3);
    }
}