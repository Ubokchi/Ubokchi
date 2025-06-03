class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        service = n / 10;
        
        answer += n * 12000;
        
        k -= service;
        if (k > 0)
            answer += k * 2000;
        
        return answer;
    }
}