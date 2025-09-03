import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] s = String.join("", spell).toCharArray();
        Arrays.sort(s);
        String key = new String(s);

        for (String w : dic) {
            if (w.length() != spell.length) continue;
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            if (key.equals(new String(arr))) {
                return 1;
            }
        }
        return 2;
    }
}