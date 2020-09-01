package com.programmers.high.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestAlbumTest {

    @Test
    void solution() {
        Assertions.assertEquals(new int[]{4, 1, 3, 0},new BestAlbum().solution(new String[]{"classic", "pop", "classic", "classic", "pop"},new int[]{500, 600, 150, 800, 2500}));
    }
}
