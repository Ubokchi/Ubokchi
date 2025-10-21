import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            int key = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                key = (arr[i] < key) ? arr[i] : key;
            }
            
            answer = new int[arr.length - 1];
            int j = 0;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (key != arr[i]) {
                    answer[index++] = arr[i];
                }
            }
        }
        
        return answer;
    }
}