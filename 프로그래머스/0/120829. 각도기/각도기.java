class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (angle < 90)
            return 1;
        else if (angle == 90)
            return 2;
        else if (angle == 180)
            return 4;
        else
            return 3;
    }
}