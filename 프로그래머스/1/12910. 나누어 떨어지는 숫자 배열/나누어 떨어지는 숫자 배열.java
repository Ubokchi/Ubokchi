import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int size = 0;
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                size++;
            }
        }
        
        if (size == 0) {
            answer = new int[]{-1};
            return answer;
        }
        
        answer = new int[size];
        
        size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[size] = arr[i];
                size++;
            }
        }  
        
        return answer;
    }
}