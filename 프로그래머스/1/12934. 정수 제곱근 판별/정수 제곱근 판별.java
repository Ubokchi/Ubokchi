class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long r = (long)Math.sqrt(n);           
        return (r*r == n) ? (r+1)*(r+1) : -1;  
    }
}