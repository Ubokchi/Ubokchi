class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a == b) {
            return a;
        }
        
        if (a < b) {
            while (a <= b) {
                answer += a;
                a++;
            }    
        } else {
            while (a >= b) {
                answer += b;
                b++;
            }
        }
        
        return answer;
    }
}