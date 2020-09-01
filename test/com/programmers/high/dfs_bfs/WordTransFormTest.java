package com.programmers.high.dfs_bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
    제한사항
    각 단어는 알파벳 소문자로만 이루어져 있습니다.
    각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
    words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
    begin과 target은 같지 않습니다.
    변환할 수 없는 경우에는 0를 return 합니다.
    입출력 예
    begin	target	words	return
    hit	cog	[hot, dot, dog, lot, log, cog]	4
    hit	cog	[hot, dot, dog, lot, log]	0

    입출력 예 설명

    예제 #1
    문제에 나온 예와 같습니다.

    예제 #2
    target인 cog는 words 안에 없기 때문에 변환할 수 없습니다

    */
public class WordTransFormTest {
    @Test
    void solution() {
        Assertions.assertEquals(4,new WordTransForm().solution("hit","cog",new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
        Assertions.assertEquals(0,new WordTransForm().solution("hit","cog",new String[]{"hot", "dot", "dog", "lot", "log"}));
    }
}
