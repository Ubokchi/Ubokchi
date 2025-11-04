class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        int pSize = p.length();

        for (int i = 0; i <= t.length() - pSize; i++) {
            long tNum = Long.parseLong(t.substring(i, i + pSize));
            if (tNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}