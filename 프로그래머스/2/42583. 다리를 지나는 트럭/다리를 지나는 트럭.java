import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> q = new ArrayDeque<>();
        int total = 0;
        int result = 0;
        for (int truck: truck_weights) {
            while (weight - total < truck) {
                q.offer(0);
                result++;
                if (q.size() >= bridge_length) {
                    total -= q.poll();
                }
            }
            q.offer(truck);
            total += truck;
            result++;
            if (q.size() >= bridge_length) {
                total -= q.poll();
            }
        }
        return result + bridge_length;
    }
}