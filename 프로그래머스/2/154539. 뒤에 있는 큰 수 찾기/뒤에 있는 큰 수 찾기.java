import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // 현재 값이 스택 top보다 크면
            // 현재 값이 뒷 큰수
            while (!stack.isEmpty() &&
                   numbers[stack.peek()] < numbers[i]) {

                int idx = stack.pop();
                answer[idx] = numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }
}