package com.programmers.high.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CallNumberTest {

    @Test
    void solution() {
        Assertions.assertFalse(new CallNumber().solution(new String[]{"119", "97674223", "1195524421"}));
        Assertions.assertFalse(new CallNumber().solution(new String[]{"1195524421", "97674223", "119"}));
        Assertions.assertTrue(new CallNumber().solution(new String[]{"123", "456", "789"}));
        Assertions.assertFalse(new CallNumber().solution(new String[]{"12", "123", "1235","567","88"}));

    }
}
