package com.programmers.high.greed;

import java.util.Arrays;
import java.util.Comparator;

public class EnforceCamera {
    /*
    고속도로를 이동하는 모든 차량이 고속도로를 이용하면서 단속용 카메라를 한 번은 만나도록 카메라를 설치하려고 합니다.

    고속도로를 이동하는 차량의 경로 routes가 매개변수로 주어질 때, 모든 차량이 한 번은 단속용 카메라를 만나도록 하려면 최소 몇 대의 카메라를 설치해야 하는지를 return 하도록 solution 함수를 완성하세요.

    제한사항

    차량의 대수는 1대 이상 10,000대 이하입니다.
    routes에는 차량의 이동 경로가 포함되어 있으며 routes[i][0]에는 i번째 차량이 고속도로에 진입한 지점, routes[i][1]에는 i번째 차량이 고속도로에서 나간 지점이 적혀 있습니다.
    차량의 진입/진출 지점에 카메라가 설치되어 있어도 카메라를 만난것으로 간주합니다.
    차량의 진입 지점, 진출 지점은 -30,000 이상 30,000 이하입니다.
    입출력 예

    routes	return
    [[-20,15], [-14,-5], [-18,-13], [-5,-3]]	2
    입출력 예 설명

    -5 지점에 카메라를 설치하면 두 번째, 네 번째 차량이 카메라를 만납니다.

    -15 지점에 카메라를 설치하면 첫 번째, 세 번째 차량이 카메라를 만납니다.
    */
    /*public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, Comparator.comparingInt(o -> Math.abs(o[0] - o[1])));
        boolean[] check = new boolean[routes.length];
        for(int i =0; i< routes.length; i++){
            if(check[i]){
                continue;
            }
            for(int j =i+1 ; j < routes.length; j++){
                if( !(routes[i][0] > routes[j][1]) && !(routes[i][1] < routes[j][0]) ) {
                    check[j] = true;
                }
            }
            answer++;
        }
        return answer;
    }*/

    public int solution(int[][] routes) {
        int answer = 1;
        //시작시간이 작은 순으로 정렬
        Arrays.sort(routes,Comparator.comparingInt(o->o[0]));

        int flag = routes[0][1];
        for(int i =1; i<routes.length;i++){
            if(flag < routes[i][0]){
                flag = routes[i][1];
                answer++;
            }else{
                flag = Math.min(flag,routes[i][1]);
            }
        }
        return answer;
    }

}
