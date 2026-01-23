class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = toSec(video_len);
        int position = toSec(pos);
        int opStart = toSec(op_start);
        int opEnd = toSec(op_end);

        // 시작 위치가 오프닝이면 바로 스킵
        if (opStart <= position && position <= opEnd) {
            position = opEnd;
        }

        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                position = Math.max(0, position - 10);
            } else if (cmd.equals("next")) {
                position = Math.min(videoLen, position + 10);
            }

            // 명령 실행 후 오프닝 체크
            if (opStart <= position && position <= opEnd) {
                position = opEnd;
            }
        }

        return toTime(position);
    }

    // "mm:ss" → 초
    private int toSec(String time) {
        String[] split = time.split(":");
        int min = Integer.parseInt(split[0]);
        int sec = Integer.parseInt(split[1]);
        return min * 60 + sec;
    }

    // 초 → "mm:ss"
    private String toTime(int sec) {
        int min = sec / 60;
        int second = sec % 60;
        return String.format("%02d:%02d", min, second);
    }
}