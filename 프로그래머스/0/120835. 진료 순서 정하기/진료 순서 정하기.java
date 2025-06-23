class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int maxIndex = -1;
        int emerCount = 1;
        int max = -1;
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (max < emergency[j]) {
                    max = emergency[j];
                    maxIndex = j;
                }
            }
            
            answer[maxIndex] = emerCount;
            emerCount++;
            emergency[maxIndex] = -1;
            max = -1;
        }
        
        return answer;
    }
}