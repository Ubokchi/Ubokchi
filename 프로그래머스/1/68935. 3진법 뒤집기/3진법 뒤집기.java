class Solution {
    public int solution(int n) {
        int answer = 0;
        int three = 1;
        String base3 = "";
        
        while (n > 0) {
            base3 = n % 3 + base3;
            n /= 3;
        }
        
        for (int i = 0; i < base3.length(); i++) {
            answer += ((int)(base3.charAt(i)) - '0') * three;
            three *= 3;
        }
        
        return answer;
    }
}