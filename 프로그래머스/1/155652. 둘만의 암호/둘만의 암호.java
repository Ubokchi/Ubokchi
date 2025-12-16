class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        boolean[] isSkip = new boolean[26];
        for (int i = 0; i < skip.length(); i++) {
            isSkip[skip.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;

            while (count < index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }

                if (isSkip[c - 'a']) {
                    continue;
                }

                count++;
            }

            answer.append(c);
        }

        return answer.toString();
    }
}