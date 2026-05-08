import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int w : works) pq.offer(w);
        for (int i = 0; i < n; i++) {
            if (pq.isEmpty()) return 0l;
            int poll = pq.poll();
            if (poll-1 > 0) pq.offer(poll-1);
        }
        long result = 0l;
        for (int p: pq) result += p*p;
        return result;
    }
}