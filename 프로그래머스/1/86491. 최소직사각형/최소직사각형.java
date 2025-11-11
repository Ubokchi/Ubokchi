import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            maxW = Math.max(maxW, sizes[i][1]);
            maxH = Math.max(maxH, sizes[i][0]);
        }
        
        return maxW * maxH;
    }
}