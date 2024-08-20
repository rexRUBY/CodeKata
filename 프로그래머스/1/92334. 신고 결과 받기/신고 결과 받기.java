import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 각 사용자의 메일 횟수를 저장할 맵 초기화
        Map<String, Integer> idMap = Arrays.stream(id_list).collect(Collectors.toMap(id -> id, id -> 0));

        // 신고를 중복 제거하여 저장
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(report));

        // 각 신고당한 사람의 신고 횟수를 카운트
        Map<String, Integer> reportCount = new HashMap<>();
        for (String s : uniqueSet) {
            String key = s.split(" ")[1];
            reportCount.put(key, reportCount.getOrDefault(key, 0) + 1);
        }

        for(String s : uniqueSet) {
            String reporter = s.split(" ")[0];
            String target = s.split(" ")[1];

            if(reportCount.getOrDefault(target,0) >= k) {
                idMap.put(reporter,idMap.get(reporter)+1);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = idMap.get(id_list[i]);
        }

        return answer;
    }
}