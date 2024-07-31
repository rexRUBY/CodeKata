class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                int keyPressCount = findKey(keymap, targets[i].charAt(j));
                System.out.println(targets[i].charAt(j) + ": " + keyPressCount);

                if (keyPressCount != -1) {
                    cnt += keyPressCount;
                } else {
                    cnt = -1;
                    break; // 문자를 찾지 못했으므로 더 이상 계산하지 않음
                }
            }
            answer[i] = cnt;
            System.out.println("Result for target[" + i + "]: " + cnt);
        }

        return answer;
    }

    public int findKey(String[] keys, char c) {
        int min = Integer.MAX_VALUE;  //정수 최댓값
        for (int i = 0; i < keys.length; i++) {
            int match = keys[i].indexOf(c);
            if (match != -1 && match < min) {
                min = match;
            }
        }
        // min이 여전히 초기값이면 문자를 찾지 못한 것임
        return min == Integer.MAX_VALUE ? -1 : min + 1;
    }
}