import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new int[]{i, priorities[i]});
        }
        
        int order = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            boolean hasHigher = false;
            for (int[] process: q) {
                if (cur[1] < process[1]) {
                    hasHigher = true;
                    break;
                }
            }
            if (hasHigher) q.offer(cur);
            else {
                order++;
                if (cur[0] == location) return order;
            }
        }
        return 0;
    }
}