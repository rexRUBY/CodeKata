import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] res) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(res);

        for(int i=0; i<lost.length; i++){
            for(int j =0; j<res.length; j++) {
                if(lost[i] == res[j]){
                    lost[i] = -1;
                    res[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++){
            for(int j =0; j<res.length; j++) {
                if(lost[i]==res[j]-1 || lost[i]==res[j]+1) {
                    answer++;
                    lost[i] = -1;
                    res[j] = -1;
                }
            }
        }

        return n - (lost.length - answer);
    }
}