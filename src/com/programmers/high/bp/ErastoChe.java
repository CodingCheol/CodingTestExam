package com.programmers.high.bp;

public class ErastoChe {
    /*
    *
    ◎ 에라토스테네스의 체
    - 2를 제외한 2의 배수는 소수가 아니다.
    - 3을 제외한 3의 배수는 소수가 아니다.
    - 5를 제외한 5의 배수는 소수가 아니다.
    - .....
    *
    ◎ 수학적 접근( 제곱근 이용 ) -> 일반적으로 n까지의 정수를
    - 수학적인 접근을 하는 것이다. 자연수 n이 소수이기 위한 필요 충분 조건은 n이 n의 제곱근보다 작은 어떤 소수로도 나눠지지 않는다.
    - 수를 수로 나누어 떨어진다면 그떄의 몫은 반드시 그 수의 제곱근보다 작기 때문이다.
    * */

    //일반정인 방법
    public int solution2(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++) {
            boolean flag = true;
            for(int j=2; j<i; j++) { //두 번째 방법에서는 j<i 부분을 j<Math.sqrt(i) 로 바꾼다.
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }

            if(flag==true) answer++;
        }

        return answer;
    }
    //아리스토 체
    public int solution(int n) {
        int answer = 0;

        int[] number = new int[n+1];

        //2부터 n까지의 수를 배열에 넣는다.
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i=2; i<=n; i++) {
            if(number[i]==0) continue;

            for(int j= 2*i; j<=n; j += i) {
                number[j] = 0;
            }
        }

        //배열에서 0이 아닌 것들의 개수를 세준다.
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                answer++;
            }
        }

        return answer;
    }
}
