import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int[] minPress = new int[26];
        Arrays.fill(minPress, Integer.MAX_VALUE);
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                int idx = key.charAt(i) - 'A';
                minPress[idx] = Math.min(minPress[idx], i + 1);
            }
        }

        // 2. targets 계산
        for (int t = 0; t < targets.length; t++) {
            int sum = 0;
            for (char c : targets[t].toCharArray()) {
                int idx = c - 'A';
                if (minPress[idx] == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                sum += minPress[idx];
            }
            answer[t] = sum;
        }

        return answer;
    }
}