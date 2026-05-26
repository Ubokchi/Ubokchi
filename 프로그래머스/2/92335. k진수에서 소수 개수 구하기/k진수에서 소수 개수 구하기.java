class Solution {

    public int solution(int n, int k) {
        String converted = Integer.toString(n, k);
        String[] numbers = converted.split("0");
        int count = 0;

        for (String num : numbers) {

            if (num.isEmpty()) continue;

            long value = Long.parseLong(num);

            if (isPrime(value)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(long num) {

        if (num < 2) return false;

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}