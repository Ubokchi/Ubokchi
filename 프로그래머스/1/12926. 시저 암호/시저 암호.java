class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                answer.append(' ');
                continue;
            }

            if (ch >= 'A' && ch <= 'Z') {
                char shifted = (char)((ch - 'A' + n) % 26 + 'A');
                answer.append(shifted);
            }
            else if (ch >= 'a' && ch <= 'z') {
                char shifted = (char)((ch - 'a' + n) % 26 + 'a');
                answer.append(shifted);
            }
        }

        return answer.toString();
    }
}