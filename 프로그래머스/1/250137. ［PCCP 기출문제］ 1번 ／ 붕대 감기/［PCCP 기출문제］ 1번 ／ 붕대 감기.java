import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];

        int maxHealth = health;
        int cur = health;
        int combo = 0;

        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int[] a : attacks) {
            attackMap.put(a[0], a[1]);
        }

        int lastTime = attacks[attacks.length - 1][0];

        for (int time = 1; time <= lastTime; time++) {
            if (attackMap.containsKey(time)) {
                // 몬스터 공격
                cur -= attackMap.get(time);
                combo = 0;

                if (cur <= 0) {
                    return -1;
                }
            } else {
                // 붕대 감기 성공
                combo++;
                cur += x;

                if (combo == t) {
                    cur += y;
                    combo = 0;
                }

                if (cur > maxHealth) {
                    cur = maxHealth;
                }
            }
        }

        return cur;
    }
}