import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> player_rank = new HashMap<>();
        for (int i = 0; i < players.length; i++) player_rank.put(players[i], i);
        
        for (String call: callings) {
            int callRank = player_rank.get(call);
            String frontPlayer = players[callRank - 1];
            
            players[callRank] = frontPlayer;
            players[callRank - 1] = call;
            
            player_rank.merge(call, -1, Integer::sum);
            player_rank.merge(frontPlayer, 1, Integer::sum);
        }
        return players;
    }
}