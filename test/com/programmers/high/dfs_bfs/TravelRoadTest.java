package com.programmers.high.dfs_bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class TravelRoadTest {

    @Test
    void solution() {
        /*
    [[ICN, JFK], [HND, IAD], [JFK, HND]]	[ICN, JFK, HND, IAD]
    [[ICN, SFO], [ICN, ATL], [SFO, ATL], [ATL, ICN], [ATL,SFO]]	[ICN, ATL, ICN, SFO, ATL, SFO]
        * */
        Assertions.assertArrayEquals(
                new TravelRoad().solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}}),
                new String[]{"ICN", "ATL", "ICN", "SFO","ATL","SFO"} );
        Assertions.assertArrayEquals(
                new TravelRoad().solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}),
                new String[]{"ICN", "JFK", "HND", "IAD"} );

    }
    @Test
    void alphabetTest(){
        String a="LetterA";
        String b2="ALetterB";
        String b3="LetterB";
        String b="ZZZ";
        int compare = a.compareTo(b);
        if (compare < 0){
            System.out.println(a+" is before "+b);
        }
        else if (compare > 0) {
            System.out.println(b+" is before "+a);
        }
        else {
            System.out.println(b+" is same as "+a);
        }
    }
}