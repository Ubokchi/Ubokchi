import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] parts = {"aya", "ye", "woo", "ma"};
        Set<String> valid = new HashSet<>();
        boolean[] used = new boolean[4];

        buildAll(parts, used, new StringBuilder(), 0, valid);

        int count = 0;
        for (String s : babbling) {
            if (valid.contains(s)) count++;
        }
        return count;
    }

    private void buildAll(String[] parts, boolean[] used, StringBuilder cur, int depth, Set<String> out) {
        if (depth > 0) {
            out.add(cur.toString()); 
        }
        if (depth == 4) return; 

        for (int i = 0; i < parts.length; i++) {
            if (used[i]) continue;
            used[i] = true;

            int len = cur.length();
            cur.append(parts[i]);
            buildAll(parts, used, cur, depth + 1, out);
            cur.setLength(len);

            used[i] = false;
        }
    }
}