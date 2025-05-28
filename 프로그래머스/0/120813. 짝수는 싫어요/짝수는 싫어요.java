class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int size = n / 2 + n % 2;
        answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = 1 + i * 2;
        }
        
        return answer;
    }
}