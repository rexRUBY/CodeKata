import java.util.*;

class Solution {
    public String solution(String x, String y) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> mapX = new HashMap<>();
        Map<String, Integer> mapY = new HashMap<>();

        //각 자릿수의 빈도 계산
        for(String s : x.split("")){
            mapX.put(s,mapX.getOrDefault(s,0)+1);
        }
        for(String s : y.split("")){
            mapY.put(s,mapY.getOrDefault(s,0)+1);
        }
        
        //공통으로 가지고 있는 수 중 더 작은 것의 갯수만큼 저장
        for(int i=9; i>=0; i--){
            if(mapX.containsKey(String.valueOf(i)) && mapY.containsKey(String.valueOf(i))) {
                int cnt = Math.min(mapX.get(String.valueOf(i)), mapY.get(String.valueOf(i)));
                for (int j = 0; j < cnt; j++)
                    answer.append(String.valueOf(i));
            }
        }
        if (answer.length() == 0) {
            return "-1";
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer.toString();
    }
}