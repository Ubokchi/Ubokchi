import java.lang.Math;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int xNum[] = new int[10];
        int yNum[] = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            xNum[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            yNum[Y.charAt(i) - '0']++;
        }
        
        for (int i = 9; i >= 0; i--) {          
            for (int j = 0; j < Math.min(xNum[i], yNum[i]); j++) {
                if (i == 0 && answer.length() == 0)
                    return "0";
                
                answer.append(i);
            }
        }
        
        if (answer.length() == 0)
            return "-1";
        
        return answer.toString();
    }
}