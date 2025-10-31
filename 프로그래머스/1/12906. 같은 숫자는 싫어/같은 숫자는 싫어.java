import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int now = arr[0];
        int size = 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (now != arr[i])  {
                now = arr[i];
                size++;
            }
        }
        
        answer = new int[size];
        answer[0] = arr[0];
        
        size = 1;
        now = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (now != arr[i]) {
                now = arr[i];
                answer[size] = now;
                size++;
            }
        }

        return answer;
    }
}