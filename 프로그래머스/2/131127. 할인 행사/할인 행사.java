import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }

        Map<String, Integer> window = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            window.put(discount[i], window.getOrDefault(discount[i], 0) + 1);
        }

        if (isMatch(target, window)) {
            answer++;
        }

        for (int i = 10; i < discount.length; i++) {
            String removeItem = discount[i - 10];
            String addItem = discount[i];

            window.put(removeItem, window.get(removeItem) - 1);
            if (window.get(removeItem) == 0) {
                window.remove(removeItem);
            }

            window.put(addItem, window.getOrDefault(addItem, 0) + 1);

            if (isMatch(target, window)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isMatch(Map<String, Integer> target, Map<String, Integer> window) {
        for (String item : target.keySet()) {
            if (window.getOrDefault(item, 0) != target.get(item)) {
                return false;
            }
        }
        return true;
    }
}