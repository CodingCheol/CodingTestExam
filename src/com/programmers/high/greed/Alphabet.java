package com.programmers.high.greed;

public class Alphabet {
   /*
   조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
            ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA

    조이스틱을 각 방향으로 움직이면 아래와 같습니다.

            ▲ - 다음 알파벳
    ▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
    ◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
    ▶ - 커서를 오른쪽으로 이동
    예를 들어 아래의 방법으로 JAZ를 만들 수 있습니다.

            - 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
            - 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
    - 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
    따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
    만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.

    제한 사항
    name은 알파벳 대문자로만 이루어져 있습니다.
    name의 길이는 1 이상 20 이하입니다.
            입출력 예
    name	return
    JEROEN	56
    JAN	23
    */
   public int solution(String name) {
       int answer = 0;
       int sum = name.chars()
               .filter(character->character != 'A')
               .map(character-> (character-'A') <= 13 ? (character-'A'): 26 -(character-'A'))
               .sum();

       // 좌,우의 최소는 문자열 시작부터 끝가지 가는경우이다.
       int min = name.length()-1;

       // A가 연속되는 경우에는 뒤로돌아갔을때 최솟값을 구해주어서 비교해준다.
       for ( int i = 0; i < name.length(); i ++ ) {
           int index = i;

           if( name.charAt(index)=='A' ) {
               while( index < name.length() && name.charAt(index)=='A') {
                   index++;
               }

               // 종료시점의 index는 연속된 A가 끝나는지점이다.

               // ((i-1)*2)은  A가 가기전까지 갔다가, 다시 Back하는 수를 세준것이다.
               // 연속된 A가 끝나는 index까지 뒤에서 세야함으로 ( 전체길이 - index )를 해준다.
               int moveCnt = ((i-1)*2) + name.length() - index;
               min = Math.min(min, moveCnt);
           }
       }

       return answer+sum+min;
   }
}
