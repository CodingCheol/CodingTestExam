package com.programmers.high.bp;

//bp = brute-force (무식하게 푼다.)
public class Carpet {
    /*
    Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

    carpet.png : 그림은 참조 부탁 ,,, https://programmers.co.kr/learn/courses/30/lessons/42842

    Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

    Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    제한사항
    갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
    노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
    카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
    입출력 예
    brown	yellow	return
    10	2	[4, 3]
    8	1	[3, 3]
    24	24	[8, 6]

    */
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        //기본 가로,세로 {3,3}
        //나올수 있는 약수를 경우의 수로 두고 계산해보자.
        int sum = brown+yellow;
        for(int i = sum; i >= 3; i--){
            if(sum % i ==0){
                if(progress(i,sum/i, yellow)){
                    return new int[]{i,sum/i};
                };
            }
        }

        return answer;
    }
    boolean progress(int x, int y, int yellow){
        // 최소 브라운 수.
        // 2x + 2y -4;
        // 가로
        //짝수 경우(4의 경우 이상) : 2개 부터 시작 -> +2
        //홀수 경우(3의 경우 이상) : 1개 부터 시작 -> +2
        // 세로
        // 곱하기
        for(int i = (x %2 ==0)? 2:1 ;i<x; i+=2 ){
            for(int j =1; j <= y-2;j++){
                //yellow 개
                if( (i*j) == yellow ){
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }
}
