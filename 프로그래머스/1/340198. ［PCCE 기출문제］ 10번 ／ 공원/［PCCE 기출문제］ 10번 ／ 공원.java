import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int maxRow = park.length;
        int maxCol = park[0].length;

        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            for (int r = 0; r <= maxRow - size; r++) {
                for (int c = 0; c <= maxCol - size; c++) {
                    if (canPlace(r, c, size, park)) {
                        return size;
                    }
                }
            }
        }
        return -1;
    }

    private boolean canPlace(int r, int c, int size, String[][] park) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}