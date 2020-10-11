package com.programmers.high.bp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumberTest {

    //      17	3
    //    011	2
    @Test
    void solution() {
        Assertions.assertEquals(new FindPrimeNumber().solution("7843"),12);
        Assertions.assertEquals(new FindPrimeNumber().solution("9999999"),0);
        Assertions.assertEquals(new FindPrimeNumber().solution("1276543"),1136);
        Assertions.assertEquals(new FindPrimeNumber().solution("17"),3);
        Assertions.assertEquals(new FindPrimeNumber().solution("011"),2);
    }

    @Test
    void isPrimeNumber() {
        Assertions.assertFalse(new FindPrimeNumber().primeNumber(4873));
        Assertions.assertFalse(new FindPrimeNumber().isPrimeNumber(4873));
    }
}