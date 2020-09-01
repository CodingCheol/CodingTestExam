package com.programmers.high.greed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlphabetTest {

    @Test
    void solution() {
        Assertions.assertEquals(11,new Alphabet().solution("JAZ"));
        Assertions.assertEquals(56,new Alphabet().solution("JEROEN"));
        Assertions.assertEquals(23,new Alphabet().solution("JAN"));
    }
}
