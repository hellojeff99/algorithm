import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        int half = nums.length / 2;
        int ponketmon = set.size();
        if (half >= ponketmon) return ponketmon;
        else return half;
    }
}