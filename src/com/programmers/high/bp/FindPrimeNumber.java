package com.programmers.high.bp;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumber {
    /*
    한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

    각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

    제한사항
    numbers는 길이 1 이상 7 이하인 문자열입니다.
    numbers는 0~9까지 숫자만으로 이루어져 있습니다.
    013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
    입출력 예
    numbers	return
    17	3
    011	2
    입출력 예 설명
    예제 #1
    [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

    예제 #2
    [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

    11과 011은 같은 숫자로 취급합니다.

    ◎ 에라토스테네스의 체
    - 2를 제외한 2의 배수는 소수가 아니다.
    - 3을 제외한 3의 배수는 소수가 아니다.
    - 5를 제외한 5의 배수는 소수가 아니다.
    - .....
    */

    public int solution(String numbers) {
        Set<Integer> result = new HashSet<>();
        rotate(numbers,new boolean[numbers.length()],"",result);
        return result.size();
    }
    void rotate(String numbers, boolean[] checkArray, String number, Set<Integer> result){

        for(int i=0; i<numbers.length() ; i++){
            //체크 안된 것
            if(!checkArray[i]){
                String newNumber = number+""+numbers.charAt(i);
                //소수 찾기
                if ( isPrimeNumber(Integer.parseInt(newNumber) ) ){
                    result.add(Integer.parseInt(newNumber));
                }
                checkArray[i] = true;
                rotate(numbers,checkArray,newNumber,result);
                checkArray[i] = false;
            }
        }
    }
    //이건 외워 두는것도 좋을꺼같은데..
    boolean primeNumber(int numbers){
        if(numbers <= 1){
            return Boolean.FALSE;
        }
        //제곱근 으로 나눴으니깐 반대로 검토하는 것은 제곱하여 찾으면 경우의 수 를 제외 할 수 있다.
        for(int i=2; i*i<=numbers; i++){
            if(numbers % i == 0){
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
    boolean isPrimeNumber(int number){
        for(int checkPrime : new int[]{2,3,5,7}){
            if(number ==1){
                return Boolean.FALSE;
            }
            if((number != checkPrime)&& (number % checkPrime ==0) ){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }


}
