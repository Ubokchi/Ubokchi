class Solution {
    public String solution(int n, int t, int m, int p) {

        StringBuilder numbers = new StringBuilder();
        int num = 0;

        while (numbers.length() < t * m) {
            numbers.append(Integer.toString(num, n).toUpperCase());
            num++;
        }

        StringBuilder answer = new StringBuilder();

        for (int i = p - 1; answer.length() < t; i += m) {
            answer.append(numbers.charAt(i));
        }

        return answer.toString();
    }
}