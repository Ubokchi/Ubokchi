class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int i;
        
        for (i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        for (i = i; i < phone_number.length(); i++) {
            answer += phone_number.charAt(i);
        }
        
        
        return answer;
    }
}