package com.programmers.high.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarathonTest {
    @Test
    void solution() {
        Assertions.assertEquals("leo",new Marathon().solution(new String[]{"leo", "kiki", "eden"},new String[]{"eden", "kiki"}));
        Assertions.assertEquals("vinko",new Marathon().solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},new String[]{"josipa", "filipa", "marina", "nikola"}));
        Assertions.assertEquals("mislav",new Marathon().solution(new String[]{"mislav", "stanko", "mislav", "ana"},new String[]{"stanko", "ana","mislav"}));
    }
}
