import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;

        // 이름 → 인덱스 매핑
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }

        // 선물 주고받은 기록
        int[][] give = new int[n][n];

        for (String g : gifts) {
            String[] parts = g.split(" ");
            int from = map.get(parts[0]);
            int to = map.get(parts[1]);
            give[from][to]++;
        }

        // 선물 지수 계산
        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            int given = 0;
            int received = 0;
            for (int j = 0; j < n; j++) {
                given += give[i][j];
                received += give[j][i];
            }
            giftIndex[i] = given - received;
        }

        // 다음 달 받을 선물 수
        int[] nextMonth = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (give[i][j] > give[j][i]) {
                    nextMonth[i]++;
                } else if (give[i][j] < give[j][i]) {
                    nextMonth[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonth[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }

        // 최댓값 반환
        int answer = 0;
        for (int cnt : nextMonth) {
            answer = Math.max(answer, cnt);
        }

        return answer;
    }
}