class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int index = -1;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i ++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}