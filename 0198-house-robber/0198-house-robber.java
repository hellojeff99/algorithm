class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int max = prev2 + num;

            prev2 = (prev1 > prev2) ? prev1 : prev2;
            prev1 = max;
        }

        return (prev1 > prev2) ? prev1 : prev2;
        

    }
}