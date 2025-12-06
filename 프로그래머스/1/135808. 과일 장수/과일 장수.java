import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int remain = score.length;
        
        Arrays.sort(score);
        
        while (remain >= m) {
            answer += score[remain - m] * m;
            remain -= m;
        }
        
        
        return answer;
    }
}