class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);
            if (sb.length() > 3 && sb.substring(sb.length() - 4).equals("1231")) {
                sb.setLength(sb.length() - 4);
                answer++;
            }
        }
        return answer;
    }
}