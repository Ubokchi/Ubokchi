class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int correct = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) correct++;
                }
            }
        }
        
        answer[0] = 7 - correct - zero;
        answer[1] = 7 - correct;
        
        if (answer[0] == 7) {
            answer[0] = 6;
        }
        if (answer[1] == 7) {
            answer[1] = 6;
        }
        
        return answer;
    }
}