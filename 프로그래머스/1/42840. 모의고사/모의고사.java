import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int A1 = 0, A2 = 0, A3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (p1[i % p1.length] == answers[i]) A1++;
            if (p2[i % p2.length] == answers[i]) A2++;
            if (p3[i % p3.length] == answers[i]) A3++;
        }

        int max = Math.max(A1, Math.max(A2, A3));

        List<Integer> list = new ArrayList<>();
        if (A1 == max) list.add(1);
        if (A2 == max) list.add(2);
        if (A3 == max) list.add(3);

        return list.stream().mapToInt(i -> i).toArray();
    }
}