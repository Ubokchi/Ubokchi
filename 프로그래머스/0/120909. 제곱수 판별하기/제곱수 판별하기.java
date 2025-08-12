class Solution {
    public int solution(int n) {
        int answer = 2;
        int mul = 0;
        int i = 1;
        
        do {
            mul = i * i;
            if (i * i == n) {
                answer = 1;
                break;
            }
            i++;
        } while (mul < n);
            
        return answer;
    }
}