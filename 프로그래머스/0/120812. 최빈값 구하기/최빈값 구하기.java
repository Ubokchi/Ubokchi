import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int max = 0;
        for (int num : array) {
            if (num > max) max = num;
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int maxCount = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
                isDuplicate = false;
            } else if (count[i] == maxCount) {
                isDuplicate = true;
            }
        }

        return isDuplicate ? -1 : answer;
    }
}