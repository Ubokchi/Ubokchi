class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int n = my_string.length();
        int i = 0;

        while (i < n) {
            if (Character.isDigit(my_string.charAt(i))) {
                int num = 0;
                int j = i;
                while (j < n && Character.isDigit(my_string.charAt(j))) {
                    num = num * 10 + (my_string.charAt(j) - '0');
                    j++;
                }
                answer += num;
                i = j;           
            } else {
                i++;             
            }
        }
        return answer;
    }
}