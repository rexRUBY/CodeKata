import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int todayValue = Integer.parseInt(today.split("\\.")[0]) * 12 * 28 +
                Integer.parseInt(today.split("\\.")[1]) * 28 +
                Integer.parseInt(today.split("\\.")[2]);

        Map<String, Integer> term = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < terms.length; i++) {
            term.put(terms[i].split(" ")[0], Integer.parseInt(terms[i].split(" ")[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            int y = Integer.parseInt(privacies[i].substring(0, 4));
            int m = Integer.parseInt(privacies[i].substring(5, 7));
            int d = Integer.parseInt(privacies[i].substring(8, 10));
            String t = privacies[i].split(" ")[1];

            int totalDays = (y * 12 * 28) + (m * 28) + d + (term.get(t) * 28) - 1;

            if (totalDays < todayValue)  // 변경된 부분: '<=' 사용
                list.add(i + 1);  // 변경된 부분: 인덱스에 1을 더함
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}