import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] alpha = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        String[] input = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : input)
            sb.append((char)('a' + Arrays.asList(alpha).indexOf(s)));
        
        answer = sb.toString();
        
        return answer;
    }
}