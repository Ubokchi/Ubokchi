import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            pos.put(players[i], i);
        }

        for (String name : callings) {
            int idx = pos.get(name);
            String front = players[idx - 1];

            players[idx - 1] = name;
            players[idx] = front;

            pos.put(name, idx - 1);
            pos.put(front, idx);
        }

        return players;
    }
}