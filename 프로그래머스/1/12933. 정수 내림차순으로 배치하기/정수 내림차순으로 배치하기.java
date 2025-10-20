import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        int size = (int) Math.log10(n) + 1;
        int[] num = new int[size];
        
        for (int i = 0; i < size; i++) {
            num[i] = (int)(n % 10);
            n /= 10;
        }
        Arrays.sort(num);
        
        for (int i = size - 1; i >= 0; i--) {
            answer *= 10;
            answer += num[i];
        }
        
        return answer;
    }
}