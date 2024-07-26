import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        List<String> speak = Arrays.asList("aya", "ye", "woo", "ma");

        for (String bab : babbling) {
            // 변환할 발음 문자열을 순서대로 처리
            boolean valid = true;

            // 연속 발음 확인
            for (String can : speak) {
                // 발음이 두 번 연속으로 나타나는 경우
                String doubleCan = can + can;
                if (bab.contains(doubleCan)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                // 발음을 모두 제거
                for (String can : speak) {
                    bab = bab.replace(can, " ");
                }
                System.out.println(bab);
                bab = bab.replace(" ", "");

                // 최종적으로 빈 문자열인지 확인
                if (bab.isEmpty()) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}