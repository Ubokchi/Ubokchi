class Solution {
    public int solution(int[][] lines) {
        int ans = 0;
        for (int x = -100; x < 100; x++) {
            int cover = 0;
            for (int[] seg : lines) {
                int a = seg[0], b = seg[1];
                if (a <= x && x + 1 <= b) {
                    cover++;
                }
            }
            if (cover >= 2) ans++;
        }
        return ans;
    }
}