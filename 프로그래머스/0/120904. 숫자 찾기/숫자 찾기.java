class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        String target = String.valueOf(k);
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target.charAt(0)) {
                return i + 1; 
            }
        }
        return -1;
    }
}