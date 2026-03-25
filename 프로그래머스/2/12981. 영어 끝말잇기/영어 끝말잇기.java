import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();
        
        used.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String current = words[i];
            
            boolean isWrongChain = prev.charAt(prev.length() - 1) != current.charAt(0);
            boolean isDuplicated = used.contains(current);
            boolean isOneLetter = current.length() == 1;
            
            if (isWrongChain || isDuplicated || isOneLetter) {
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[] {person, turn};
            }
            
            used.add(current);
        }
        
        return new int[] {0, 0};
    }
}