class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = 0, w = 0;

        // 시작 위치 찾기
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    h = i; // 세로 위치
                    w = j; // 가로 위치
                }
            }
        }

        // 명령어 처리
        for (int i = 0; i < routes.length; i++) {
            String op = routes[i].split(" ")[0];
            int n = Integer.parseInt(routes[i].split(" ")[1]);
            boolean canMove = true;

            if (op.equals("N")) { // 북쪽
                for (int step = 1; step <= n; step++) {
                    if (h - step < 0 || park[h - step].charAt(w) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) h -= n;
            }

            if (op.equals("S")) { // 남쪽
                for (int step = 1; step <= n; step++) {
                    if (h + step >= park.length || park[h + step].charAt(w) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) h += n;
            }

            if (op.equals("W")) { // 서쪽
                for (int step = 1; step <= n; step++) {
                    if (w - step < 0 || park[h].charAt(w - step) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) w -= n;
            }

            if (op.equals("E")) { // 동쪽
                for (int step = 1; step <= n; step++) {
                    if (w + step >= park[h].length() || park[h].charAt(w + step) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) w += n;
            }
        }

        return new int[]{h, w};
    }
}