package com.programmers.high.dp;

public class IntegerTriangle {
    /*
    위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다.
    아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다.
    예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.

    삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 거쳐간 숫자의 최댓값을 return 하도록 solution 함수를 완성하세요.

    제한사항
    삼각형의 높이는 1 이상 500 이하입니다.
    삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수입니다.

    입출력 예
    triangle	result
    효율성 문제 ㅇ

    [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]  30
    */
    private int[][] triangles;
    private int[][] triangleSum;
    public int solution(int[][] triangle) {
        triangles = triangle;
        triangleSum = new int[triangle.length][triangle.length];
        return dfs(0,0);
    }
    public int dfs(int height, int index){
        if(height == triangles.length){
            return 0;
        }
        if (triangleSum[height][index] > 0) {
            return triangleSum[height][index];
        }

        return triangleSum[height][index] = triangles[height][index]
                + Math.max( dfs(height+1,index), dfs(height+1,index+1));

    }
    /*
    //효율성이 실패한 코드이다.
    // 결과 값을 지정한뒤 담아주거나, 넘기는 변수가 적는것만으로도 엄청난 차이를 보여줌을 알 수 있다.
    public int solution(int[][] triangle) {
        int answer = 0;
        answer = dfs(triangle,1,0,triangle[0][0]);
        return answer;
    }
    public int dfs(int[][] triangle, int height, int preIndex, int sum){
        if(height == triangle.length-1){
            return sum;
        }

        int leftSum = dfs(triangle,height+1, preIndex,sum + triangle[height][preIndex]);
        int rightSum = dfs(triangle,height+1, preIndex+1,sum + triangle[height][preIndex+1]);

        return Math.max(leftSum,rightSum);
    }*/
}
