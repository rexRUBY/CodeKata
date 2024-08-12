import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();

        for(int i=0; i<players.length; i++)
            rank.put(players[i],i);

        for(String call : callings) {
            int curr = rank.get(call);
            if(curr>0) {
                String temp = players[curr-1];
                players[curr-1] = players[curr];
                players[curr] = temp;

                rank.put(players[curr], curr);
                rank.put(players[curr-1], curr - 1);

            }
        }

        return players;
    }
}