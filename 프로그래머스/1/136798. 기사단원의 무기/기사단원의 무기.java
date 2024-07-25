class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        //약수에는 반드시 짝이 있으므로 제곱근 까지만 구한 뒤 2를 곱하면 된다.
        for(int i=1; i<=number; i++) {
            int cnt = 0;
            for (int j=1; j<=Math.sqrt(i); j++){
                if(i%j == 0)
                    cnt += 2;
                if (j * j == i)  // 제곱근인 경우 중복 카운트 방지
                    cnt--;
            }
            answer += (cnt > limit) ? power : cnt;
        }
        return answer;
    }
}