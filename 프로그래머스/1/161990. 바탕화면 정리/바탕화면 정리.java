class Solution {
    public int[] solution(String[] wallpaper) {
        int minR=50, minC=50, maxR=0, maxC=0;

        for(int r=0; r<wallpaper.length; r++){
            for(int c=0; c<wallpaper[r].length(); c++){
                if(wallpaper[r].charAt(c)=='#'){
                    minR = Math.min(minR, r);
                    minC = Math.min(minC, c);
                    maxR = Math.max(maxR, r);
                    maxC = Math.max(maxC, c);
                }
            }
        }
        int[] answer = {minR,minC,maxR+1,maxC+1};
        return answer;
    }
}