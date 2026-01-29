class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true; // 단어의 시작 여부

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                sb.append(ch);
                isStart = true;
            } else {
                if (isStart) {
                    sb.append(Character.toUpperCase(ch));
                    isStart = false;
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
        }

        return sb.toString();
    }
}