class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1; // num 상자 자신 포함

        // 1. num 상자의 층(row)과 열(col) 구하기
        int row = (num - 1) / w;
        int idx = (num - 1) % w;

        int col;
        if (row % 2 == 0) { // 왼 → 오
            col = idx;
        } else { // 오 → 왼
            col = w - 1 - idx;
        }

        // 2. 위층들에서 같은 열에 상자가 있는지 확인
        int totalRows = (n + w - 1) / w;

        for (int r = row + 1; r < totalRows; r++) {
            int start = r * w + 1;
            int end = Math.min(start + w - 1, n);
            int countInRow = end - start + 1;

            int targetIdx;
            if (r % 2 == 0) { // 왼 → 오
                targetIdx = col;
            } else { // 오 → 왼
                targetIdx = w - 1 - col;
            }

            if (targetIdx < countInRow) {
                answer++;
            }
        }

        return answer;
    }
}