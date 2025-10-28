class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        } 
        
        char str[] = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(str[i])) {
                answer = false;
            }
        }
        
        return answer;
    }
}