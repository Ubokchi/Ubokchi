import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(countMap.values());
        
        counts.sort(Collections.reverseOrder());
        
        int sum = 0;
        int kinds = 0;
        
        for (int count : counts) {
            sum += count;
            kinds++;
            
            if (sum >= k) {
                return kinds;
            }
        }
        
        return kinds;
    }
}