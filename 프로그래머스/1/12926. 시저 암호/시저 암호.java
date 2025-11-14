class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 공백이면 그대로 추가
            if (ch == ' ') {
                answer.append(' ');
                continue;
            }

            // 대문자 A~Z
            if (ch >= 'A' && ch <= 'Z') {
                char shifted = (char)((ch - 'A' + n) % 26 + 'A');
                answer.append(shifted);
            }
            // 소문자 a~z
            else if (ch >= 'a' && ch <= 'z') {
                char shifted = (char)((ch - 'a' + n) % 26 + 'a');
                answer.append(shifted);
            }
        }

        return answer.toString();
    }
}