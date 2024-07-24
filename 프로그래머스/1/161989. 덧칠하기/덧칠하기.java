class Solution {
    //n:구역의 길이, m:롤러의 길이, section: 덧칠횟수
    public int solution(int n, int m, int[] section) {
        int paint = 0; // 덧칠 횟수
        int painted = 0; // 마지막으로 칠한 타일

        for (int s : section) {
            if(s > painted) {
                paint++;
                painted = s + m - 1;
            }
        }
        return paint;
    }
}