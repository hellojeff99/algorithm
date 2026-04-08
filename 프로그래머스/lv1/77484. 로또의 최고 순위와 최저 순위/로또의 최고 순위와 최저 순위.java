import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: win_nums) set.add(num);
        int count = 0;
        int zero = 0;
        for (int num: lottos) {
            if (num == 0) zero++;
            else if (set.contains(num)) count++;
        }
        int max = 6 - (count + zero) + 1;
        int min = 6 - count + 1;
        max = max > 6 ? 6 : max;
        min = min > 6 ? 6 : min;
        return new int[]{max, min};
    }
}