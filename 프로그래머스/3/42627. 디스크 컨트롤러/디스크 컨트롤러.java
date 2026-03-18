import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        int idx = 0;
        int time = 0;
        int result = 0;
        while (idx < jobs.length || !pq.isEmpty()) {
            while (idx < jobs.length && time >= jobs[idx][0]) {
                pq.offer(jobs[idx]);
                idx++;
            }
            
            if (!pq.isEmpty()) {
                int[] current = pq.poll();
                time += current[1];
                result += time - current[0];
            } else {
                time = jobs[idx][0];
            }
        }
        return result / jobs.length;
    }
}