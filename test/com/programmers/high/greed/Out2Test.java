package com.programmers.high.greed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Out2Test {

    /*
   1924	    2	94
    1231234	    3	3234
    4177252841	4	775841
    999, 2 -> 9
    * */
    @Test
    void solution() {

        Assertions.assertEquals("9",new BigNumber().solution("999",2));
        Assertions.assertEquals("94",new BigNumber().solution("1924",2));
        Assertions.assertEquals("3234",new BigNumber().solution("1231234",3));
        Assertions.assertEquals("775841",new BigNumber().solution("4177252841",4));
    }
}
