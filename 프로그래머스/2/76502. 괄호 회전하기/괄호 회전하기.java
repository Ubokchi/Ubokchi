class Solution {
    public int solution(String s) {
        int n = s.length();
        int answer = 0;

        for (int x = 0; x < n; x++) {
            if (isValid(s, x)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isValid(String s, int start) {
        int n = s.length();
        char[] stack = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt((start + i) % n);

            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } else {
                if (top == -1) return false;

                char open = stack[top--];

                if ((c == ')' && open != '(') ||
                    (c == ']' && open != '[') ||
                    (c == '}' && open != '{')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}