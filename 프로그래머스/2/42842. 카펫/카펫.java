import java.util.ArrayList;
import java.util.List;

// x와 y는 yellow의 가로 세로 길이, xy = yellow
// (x+2) * (y+2) = 전체 타일의 갯수 = yellow + brown
// xy + 2x + 2y + 4 = yellow + brown -> 2(x + y) = brown - 4
// 조건 1 : xy = yellow 만족하는 x와 y를 찾기 ->  yellow의 약수 찾기
// 조건 2 : 2(x + y) = brown - 4 를 만족하는 x와 y

class Solution {
    public int[] solution(int brown, int yellow) {
        List<int[]> xy = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0)
                xy.add(new int[]{yellow / i, i});
        }

        for(int[] pair : xy) {
            int x = pair[0];
            int y = pair[1];

            if(2*(x+y) == brown -4)
                return new int[]{x + 2, y + 2};
        }

        return new int[]{0, 0};
    }
}