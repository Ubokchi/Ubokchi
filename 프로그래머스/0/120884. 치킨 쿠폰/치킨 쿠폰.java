class Solution {
    public int solution(int chicken) {
        if (chicken < 10) return 0;
        return (chicken - 1) / 9;
    }
}