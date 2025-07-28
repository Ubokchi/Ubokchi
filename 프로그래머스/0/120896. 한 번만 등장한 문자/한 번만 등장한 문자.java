import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                sb.append(s.charAt(i));
            }
        }

        char[] result = sb.toString().toCharArray();
        Arrays.sort(result);
        return new String(result);
    }
}