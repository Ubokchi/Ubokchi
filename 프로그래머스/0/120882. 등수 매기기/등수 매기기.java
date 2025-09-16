import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] avg = new double[n];
        for (int i = 0; i < n; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int higher = 0;
            for (int j = 0; j < n; j++) {
                if (avg[j] > avg[i]) higher++;
            }
            ans[i] = higher + 1;
        }
        return ans;
    }
}