class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int bigSide = (sides[0] > sides[1]) ? sides[0] : sides[1];
        int smallSide = (sides[0] < sides[1]) ? sides[0] : sides[1];
        int newSide = bigSide - smallSide + 1;
        
        while (newSide < bigSide + smallSide) {
            newSide++;
            answer++;
        }
    
        return answer;
    }
}