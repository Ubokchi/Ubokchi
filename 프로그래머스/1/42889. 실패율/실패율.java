import java.util.*;

class Solution {
    
    class Stage {
        int stage;
        double failRate;

        Stage(int stage, double failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N + 2];
        
        for (int st : stages) {
            count[st]++;
        }

        List<Stage> list = new ArrayList<>();
        int players = stages.length;

        for (int i = 1; i <= N; i++) {
            double failRate = 0;

            if (players > 0) {
                failRate = (double) count[i] / players;
            }

            players -= count[i]; 
            list.add(new Stage(i, failRate));
        }

        Collections.sort(list, (a, b) -> {
            if (a.failRate == b.failRate) {
                return a.stage - b.stage;
            }
            return Double.compare(b.failRate, a.failRate);
        });

        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).stage;
        }

        return answer;
    }
}