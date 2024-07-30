class Solution {
    public int solution(String s) {
        int answer = 0;
        while (!s.isEmpty()) {
            char x = s.charAt(0);
            int xCount = 0;
            int otherCount = 0;
            int idx = 0;

            for (idx = 0; idx < s.length(); idx++) {
                if (s.charAt(idx) == x)
                    xCount++;
                else
                    otherCount++;
                if (xCount == otherCount) 
                    break;
            } // 똑같은 글자가 나타난 인덱스를 저장

            answer++;
            if (idx < s.length()) {
                s = s.substring(idx + 1);
            } else {
                s = ""; //break 마지막 문자열 처리
            }
        }
        return answer;
    }
}