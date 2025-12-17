class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        
        int i = 0;
        while (i < s.length()) {
            char start = s.charAt(0);
            
            if (s.charAt(i) == start) {
                count++;
            } else {
                count--;
            }
            i++;
            
            if (count == 0) {
                s = s.substring(i);
                i = 0;
                answer++;
            }
        }
        
        if (s.length() != 0) answer++;
        
        return answer;
    }
}