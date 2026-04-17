import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        
        int currentDeployDay = getRequiredDays(progresses[0], speeds[0]);
        int count = 1;
        
        for (int i = 1; i < progresses.length; i++) {
            int days = getRequiredDays(progresses[i], speeds[i]);
            
            if (days <= currentDeployDay) {
                count++;
            } else {
                result.add(count);
                currentDeployDay = days;
                count = 1;
            }
        }
        
        result.add(count);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    private int getRequiredDays(int progress, int speed) {
        return (100 - progress + speed - 1) / speed;
    }
}