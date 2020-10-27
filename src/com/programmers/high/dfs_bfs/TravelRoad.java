package com.programmers.high.dfs_bfs;

import java.util.ArrayList;
import java.util.List;

public class TravelRoad {
    /*
    주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 ICN 공항에서 출발합니다.

    항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    제한사항
    모든 공항은 알파벳 대문자 3글자로 이루어집니다.
    주어진 공항 수는 3개 이상 10,000개 이하입니다.
    tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
    주어진 항공권은 모두 사용해야 합니다.
    만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
    모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.

    입출력 예
    tickets	return

    [[ICN, JFK], [HND, IAD], [JFK, HND]]	[ICN, JFK, HND, IAD]
    [[ICN, SFO], [ICN, ATL], [SFO, ATL], [ATL, ICN], [ATL,SFO]]	[ICN, ATL, ICN, SFO, ATL, SFO]

    입출력 예 설명
    예제 #1
    [ICN, JFK, HND, IAD] 순으로 방문할 수 있습니다.

    예제 #2
    [ICN, SFO, ATL, ICN, ATL, SFO] 순으로 방문할 수도 있지만 [ICN, ATL, ICN, SFO, ATL, SFO] 가 알파벳 순으로 앞섭니다.
    * */
    //BFS 문제이다.
    // 알파벳 우선 순위를 먼저 잡으면 된다.
    // 알파벳 우선 순위로 했을때 결과가 안나올수도 있다. 그래서 DFS로 풀어야 한다.
    private String[][] tickets;
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        this.tickets = tickets;
        boolean[] check = new boolean[tickets.length];

        List<String> list = new ArrayList<>();
        list.add("ICN");

        answer = dfs(check,list.get(0),list);
        return answer;
    }
    String[] dfs(boolean[] check, String start, List<String> list){

        if(list.size() == tickets.length+1){
            return list.toArray(new String[0]);
        }

        String[] result = null;
        String target = "ZZZ";
        for(int i= 0; i <tickets.length; i++){
            if(check[i]) continue;
            if(tickets[i][0].equals(start)){
                check[i] =true;
                list.add(tickets[i][1]);
                String[] candidate  = dfs(check,tickets[i][1],list);
                if(target.compareTo(tickets[i][1]) > 0 && candidate != null){
                    target = tickets[i][1];
                    result = candidate;
                }
                list.remove(list.size()-1);
                check[i] =false;
            }
        }

        return result;
    }
    /*String[] bfs(String[][] tickets){
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();
        queue.add("ICN");
        result.add("ICN");

        boolean[] check = new boolean[tickets.length];
        while (!queue.isEmpty()){
            String start = queue.poll();
            String target = "ZZZ";
            int index = -1;
            for(int i =0; i <tickets.length ; i++){
                if(check[i]) continue;

                if(tickets[i][0].equals(start)){
                    if(target.compareTo(tickets[i][1]) > 0){
                        target = tickets[i][1];
                        index = i;
                    }
                }
            }
            //조건에서 없는 경우는 없다고 하였으니 -1 일 경우가 마지막 일것이다.
            if(index != -1 ){
                check[index] = true;
                result.add(target);
                queue.offer(target);
            }
        }
        return result.toArray(new String[0]);
    }*/
}
