class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += (char)(my_string.charAt(i) + 32);
            } else {
                answer += (char)(my_string.charAt(i) - 32);
            }
        }
        
        return answer;
    }
}