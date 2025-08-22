class Solution {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            int x = dots[i][0];
            int y = dots[i][1];
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        return (maxX - minX) * (maxY - minY);
    }
}