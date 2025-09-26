class Solution {
    public int solution(int i, int j, int k) {
        char target = (char) ('0' + k);
        int count = 0;

        for (int n = i; n <= j; n++) {
            String s = String.valueOf(n);
            for (int idx = 0; idx < s.length(); idx++) {
                if (s.charAt(idx) == target) count++;
            }
        }
        return count;
    }
}