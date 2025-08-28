class Solution {
    public int solution(int[][] board) {
        int size = board.length;
        boolean[][] danger = new boolean[size][size];

        // 8방향 벡터 (상하좌우+대각선)
        int[] dx = {-1,-1,-1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1,-1, 1,-1, 0, 1};

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) {
                    danger[i][j] = true;
                    for (int k = 0; k < 8; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (0 <= ni && ni < size && 0 <= nj && nj < size) {
                            danger[ni][nj] = true;
                        }
                    }
                }
            }
        }

        // 안전 칸 세기
        int answer = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0 && !danger[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}