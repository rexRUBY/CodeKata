import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);

            if(choices[i] < 4)
                scoreMap.put(first,scoreMap.getOrDefault(first,0) + (4-choices[i]));
            else if(choices[i] > 4)
                scoreMap.put(second,scoreMap.getOrDefault(second,0) + (choices[i]-4));
        }

        StringBuilder sb= new StringBuilder();
        sb.append(scoreMap.getOrDefault('R',0) >= scoreMap.getOrDefault('T',0) ? 'R' : 'T');
        sb.append(scoreMap.getOrDefault('C',0) >= scoreMap.getOrDefault('F',0) ? 'C' : 'F');
        sb.append(scoreMap.getOrDefault('J',0) >= scoreMap.getOrDefault('M',0) ? 'J' : 'M');
        sb.append(scoreMap.getOrDefault('A',0) >= scoreMap.getOrDefault('N',0) ? 'A' : 'N');

        return sb.toString();
    }
}