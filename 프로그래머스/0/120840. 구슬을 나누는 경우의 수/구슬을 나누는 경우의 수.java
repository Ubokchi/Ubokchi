import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share).intValue();  // int로 변환
    }

    private BigInteger combination(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}