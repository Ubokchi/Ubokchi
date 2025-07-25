class Solution {
    public long solution(String numbers) {
        long answer = 0;

        while (!numbers.isEmpty()) {
            answer *= 10;
            if (numbers.startsWith("zero")) {
                numbers = numbers.substring(4);
            } else if (numbers.startsWith("one")) {
                answer += 1;
                numbers = numbers.substring(3);
            } else if (numbers.startsWith("two")) {
                answer += 2;
                numbers = numbers.substring(3);
            } else if (numbers.startsWith("three")) {
                answer += 3;
                numbers = numbers.substring(5);
            } else if (numbers.startsWith("four")) {
                answer += 4;
                numbers = numbers.substring(4);
            } else if (numbers.startsWith("five")) {
                answer += 5;
                numbers = numbers.substring(4);
            } else if (numbers.startsWith("six")) {
                answer += 6;
                numbers = numbers.substring(3);
            } else if (numbers.startsWith("seven")) {
                answer += 7;
                numbers = numbers.substring(5);
            } else if (numbers.startsWith("eight")) {
                answer += 8;
                numbers = numbers.substring(5);
            } else if (numbers.startsWith("nine")) {
                answer += 9;
                numbers = numbers.substring(4);
            }
        }

        return answer;
    }
}