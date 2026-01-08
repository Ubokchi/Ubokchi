class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int limitTime = addTenMinutes(schedules[i]);
            boolean ok = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1;

                if (day >= 6) continue;

                if (timelogs[i][j] > limitTime) {
                    ok = false;
                    break;
                }
            }

            if (ok) answer++;
        }

        return answer;
    }

    private int addTenMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;

        minute += 10;
        if (minute >= 60) {
            hour++;
            minute -= 60;
        }

        return hour * 100 + minute;
    }
}