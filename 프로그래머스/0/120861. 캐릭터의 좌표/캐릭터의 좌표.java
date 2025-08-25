class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0}; // 시작 좌표 [0, 0]

        // 맵의 이동 가능한 최대 범위 계산
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String key : keyinput) {
            int x = answer[0];
            int y = answer[1];

            switch (key) {
                case "up":
                    if (y + 1 <= maxY) y++;
                    break;
                case "down":
                    if (y - 1 >= -maxY) y--;
                    break;
                case "left":
                    if (x - 1 >= -maxX) x--;
                    break;
                case "right":
                    if (x + 1 <= maxX) x++;
                    break;
            }

            answer[0] = x;
            answer[1] = y;
        }

        return answer;
    }
}