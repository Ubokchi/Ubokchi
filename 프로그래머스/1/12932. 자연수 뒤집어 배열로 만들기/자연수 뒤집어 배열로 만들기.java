class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int size = 0;
        long temp = n;
        
        while (temp > 0) {
            temp /= 10;
            size++;
        }
        
        answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}