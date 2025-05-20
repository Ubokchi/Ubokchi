import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        answer += n % 10;
        
        while (n >= 10) {
            n /= 10;
            answer += n % 10;
        }
        
        System.out.println(answer);

        return answer;
    }
}