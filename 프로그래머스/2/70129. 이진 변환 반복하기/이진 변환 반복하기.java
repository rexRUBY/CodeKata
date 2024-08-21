class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCnt = 0;

        while (!s.equals("1")) {
            zeroCnt += s.length() - (s.replaceAll("0","").length());
            s = Integer.toBinaryString(s.replaceAll("0","").length());
            count++;
        }

        int[] answer = {count,zeroCnt};
        return answer;
    }
}