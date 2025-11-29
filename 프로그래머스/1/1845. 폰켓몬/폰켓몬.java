import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 1;
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1])
                count++;
        }
        
        answer = (nums.length / 2 >= count) ? count : nums.length / 2;
        
        return answer;
    }
}