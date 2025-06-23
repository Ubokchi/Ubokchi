class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageStr = String.valueOf(age);

        for (int i = 0; i < ageStr.length(); i++) {
            int digit = ageStr.charAt(i) - '0';
            char ch = (char) ('a' + digit); 
            sb.append(ch);
        }

        return sb.toString();
    }
}