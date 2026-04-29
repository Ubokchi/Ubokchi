import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] sets = s.split("\\},\\{");

        Arrays.sort(sets, Comparator.comparingInt(String::length));

        List<Integer> answer = new ArrayList<>();
        Set<Integer> used = new HashSet<>();

        for (String set : sets) {
            String[] nums = set.split(",");

            for (String numStr : nums) {
                int num = Integer.parseInt(numStr);

                if (!used.contains(num)) {
                    used.add(num);
                    answer.add(num);
                }
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}