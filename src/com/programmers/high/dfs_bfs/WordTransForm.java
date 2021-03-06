package com.programmers.high.dfs_bfs;

import java.util.Comparator;

/*
    두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.

    1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
    2. words에 있는 단어로만 변환할 수 있습니다.
    예를 들어 begin이 hit, target가 cog, words가 [hot,dot,dog,lot,log,cog]라면 hit -> hot -> dot -> dog -> cog와 같이 4단계를 거쳐 변환할 수 있습니다.

    두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.

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
public class WordTransForm {
    private String target;

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        this.target = begin;

        String startWord = null;
        boolean[] check = new boolean[words.length];
        for(int i =0; i<words.length; i++){
            if(words[i].equals(target)){
                startWord = words[i];
                check[i] = true;
            }
        }
        if(startWord == null){
            return 0;
        }
        answer = dfs(words,check, startWord,0);

        return answer == 51 ? 0 :answer;
    }

    int dfs(String[] words, boolean[] check, String word, int count) {

        int min = 51;
        if(isOneDiff(target,word)){
            return count+1;
        }
        for(int i =0; i<words.length; i++){
            if(check[i]) continue;

            if(isOneDiff(words[i],word)){
                check[i] = true;
                min = Math.min( min, dfs(words,check,words[i],count+1) );
                check[i] = false;
            }
        }
        return min;
    }

    boolean isOneDiff(String word, String word2) {
        int count = 0;
        for(int i=0; i<word.length() ; i++){
            if(word.charAt(i) != word2.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }
}



  /* public int solution(String begin, String target, String[] words) {
        int answer = 0;
        //target 이 있어야 변환이 가능.
        if( Arrays.stream(words).noneMatch(t->t.equals(target))){
            return 0;
        }

        answer = dfs(begin,target,words,0);
        return answer;
    }
    private int dfs(String begin, String target, String[] words, int result){
        if(begin.equals(target)){
            return result;
        }
        int min = words.length;

        for(String word : words){
            int count = 0;
            for(int i =0; i< begin.length();i++){
                if(begin.charAt(i) != word.charAt(i)){
                    count++;
                    if(count ==2){
                        break;
                    }
                }
            }
            if(count ==1) {
                int candidate = dfs(word,target,words,++result);
                if(min >candidate){
                    min = candidate;
                }
            }
        }

        return min;
    }*/