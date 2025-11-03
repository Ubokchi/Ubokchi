class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int GCD = 1;
        int LCM = 1;
        int temp = 1;
        int big = (n < m) ? m : n;
        
        for (int i = 1; i <= big; i++) { 
            if (n % i == 0 && m % i == 0) {
                GCD = i;
            }
        }
        
        LCM = n * m / GCD;
        
        answer = new int[2];
        answer[0] = GCD;
        answer[1] = LCM;
            
        
        return answer;
    }
}