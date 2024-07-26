class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int possible = 0;

        //일치하는 로또 갯수 시간복잡도
        // O(n^2) 이지만 크기는 항상 고정이므로 이중 for문 사용에 문제 X
        for(int lotto : lottos){
            for(int num : win_nums) {
                if(num == lotto)
                    cnt++;
            }
            if (lotto == 0)
                possible++;
        }

        // 순위 계산 (7 - 맞춘 개수, 단 2개 이하면 6등)
        int maxRank = Math.min(7 - (cnt+possible), 6);;
        int minRank = Math.min(7 - cnt, 6);
        System.out.println(maxRank+" "+minRank);

        return new int[]{maxRank, minRank};
    }
}