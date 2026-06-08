import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dict = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            dict.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        List<Integer> answer = new ArrayList<>();
        int nextIndex = 27;

        int i = 0;

        while (i < msg.length()) {
            String w = "";

            int j = i;

            while (j < msg.length() &&
                   dict.containsKey(msg.substring(i, j + 1))) {
                w = msg.substring(i, j + 1);
                j++;
            }

            answer.add(dict.get(w));

            if (j < msg.length()) {
                dict.put(msg.substring(i, j + 1), nextIndex++);
            }

            i += w.length();
        }

        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}