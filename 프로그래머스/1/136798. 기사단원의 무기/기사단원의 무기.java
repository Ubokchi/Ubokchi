class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] numPower = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                numPower[j]++;
            }
        }
        
        for (int i = 1; i <= number; i++) {
            if (numPower[i] > limit) {
                answer += power;
            } else {
                answer += numPower[i];
            }
        }
        
        return answer;
    }
}