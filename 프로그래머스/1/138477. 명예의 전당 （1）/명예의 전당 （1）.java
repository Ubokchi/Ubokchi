import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[k + 1];
        
        for (int i = 0; i < score.length; i++) {
            temp[0] = score[i];
            Arrays.sort(temp);
            
            if (i < k) {
                answer[i] = temp[k - i];   
            } else {
                answer[i] = temp[1];
            }
        }
        
        
        return answer;
    }
}