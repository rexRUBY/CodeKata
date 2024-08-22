class Solution {
    public long solution(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        long prev2 = 0;
        long prev1 = 1;
        long current = 0;
        
        for(int i=2; i<=n; i++) {
            current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current % 1234567;
        }
        
        return current%1234567;
    }
}