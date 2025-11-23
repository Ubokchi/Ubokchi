class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n / a >= 1) {
            int result = n / a;
            answer += result * b;
            
            n = result * b + n % a;
        }
        
        return answer;
    }
}