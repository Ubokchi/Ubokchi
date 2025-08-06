import java.util.*;

class Solution {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                result.add(num);
            }
        }
        
        return result;
    }
}