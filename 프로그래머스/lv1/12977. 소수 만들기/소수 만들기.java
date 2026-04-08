import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    boolean isPrime = true;
                    for (int n = 2; n * n <= num; n++) {
                        if (num % n == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) count++;
                }
            }
        }
        return count;
    }
}