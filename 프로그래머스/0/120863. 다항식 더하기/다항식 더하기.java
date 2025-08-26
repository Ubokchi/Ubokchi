class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] nums = polynomial.split(" ");
        int xSum = 0;
        int nSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals("+")) {
                continue;
            } else if (nums[i].endsWith("x")) {    // x
                if (nums[i].length() == 1) {
                    xSum++;
                } else {
                    xSum += Integer.parseInt
                        (nums[i].substring(0, nums[i].length() - 1));
                }  
            } else {
                nSum += Integer.parseInt(nums[i]);
            }
        }
        
        if (nSum == 0 && xSum != 1) {
            answer = xSum + "x";
        } else if (xSum == 0) {
            answer = Integer.toString(nSum); 
        } else if (xSum == 1) {
            answer = "x";
            if (nSum != 0) {
                answer += " + " + nSum;
            }
        } else {
            answer = xSum + "x + " + nSum;
        }
        
        return answer;
    }
}