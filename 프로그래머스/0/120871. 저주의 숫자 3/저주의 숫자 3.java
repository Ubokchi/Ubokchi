class Solution {
    public int solution(int n) {
        int count = 0;
        int number = 0;

        while (count < n) {
            number++;
            if (number % 3 != 0 && !Integer.toString(number).contains("3")) {
                count++;
            }
        }

        return number;
    }
}
