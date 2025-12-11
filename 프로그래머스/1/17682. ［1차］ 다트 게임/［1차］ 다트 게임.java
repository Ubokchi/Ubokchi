class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        
        int i = 0;
        while (dartResult.length() != 0) {
            char start = dartResult.charAt(0);
            
            if (start == '*' && i != 0) {
                scores[i - 1] *= 2;
                
                if (i >= 2) {
                    scores[i - 2] *= 2;
                }
                
                dartResult = dartResult.substring(1);
            } else if (start == '#' && i != 0) {
                scores[i - 1] *= -1;
                
                dartResult = dartResult.substring(1);
            } else {
                int num = start - '0';
                char end = dartResult.charAt(1);
                
                if (end == '0') {
                    num = 10;
                    end = dartResult.charAt(2);
                    dartResult = dartResult.substring(3);
                } else {
                    dartResult = dartResult.substring(2);
                }
                
                if (end == 'S') {
                    scores[i] = num;
                } else if (end == 'D') {
                    scores[i] = num * num;
                } else if (end == 'T') {
                    scores[i] = num * num * num;
                }
                
                i++;
            }
        }
        
        for (i = 0; i < 3; i++) {
            answer += scores[i];
        }
        
        return answer;
    }
}