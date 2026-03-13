class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            int bit = 1 << i;
            for (int num : nums) {
                if ((num & bit) != 0) {
                    count++;
                }
            }

            if (count % 3 == 1) {
                result |= bit;
            }
        }
        return result;
    }
}