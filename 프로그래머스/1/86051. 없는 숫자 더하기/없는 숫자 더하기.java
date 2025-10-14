class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int i = 1;
        int j = 0;
        
        for (i = 1; i <= 9; i++) {
            for (j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    break;
                }
            }
            if (j == numbers.length)
                answer += i;
        }
        
        return answer;
    }
}