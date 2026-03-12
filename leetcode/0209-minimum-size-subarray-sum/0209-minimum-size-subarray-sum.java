class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        int count = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            sum+= nums[end];
            
            while (sum >= target) {
                count = (count > end - start + 1) ? end - start + 1 : count;
                sum -= nums[start];
                start++;
            }
        }
        return (count == Integer.MAX_VALUE) ? 0 : count;
    }
}