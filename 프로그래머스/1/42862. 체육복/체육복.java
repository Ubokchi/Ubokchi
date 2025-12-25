import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;

        boolean[] have = new boolean[n + 1];
        boolean[] losted = new boolean[n + 1];

        for (int r : reserve) have[r] = true;
        for (int l : lost) losted[l] = true;

        // 1. 자기 여벌로 해결
        for (int i = 1; i <= n; i++) {
            if (have[i] && losted[i]) {
                have[i] = false;
                losted[i] = false;
                answer++;
            }
        }

        // 2. 빌려주기
        for (int i = 1; i <= n; i++) {
            if (!losted[i]) continue;

            if (i > 1 && have[i - 1]) {
                have[i - 1] = false;
                answer++;
            } 
            else if (i < n && have[i + 1]) {
                have[i + 1] = false;
                answer++;
            }
        }

        return answer;
    }
}