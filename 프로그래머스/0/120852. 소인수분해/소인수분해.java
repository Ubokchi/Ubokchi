import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> factors = new LinkedHashSet<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        int[] answer = new int[factors.size()];
        int idx = 0;
        for (int factor : factors) {
            answer[idx++] = factor;
        }

        return answer;
    }
}