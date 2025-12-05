class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;

        for (int pos : section) {
            if (pos > painted) {
                painted = pos + m - 1;
                answer++;
            }
        }
        return answer;
    }
}