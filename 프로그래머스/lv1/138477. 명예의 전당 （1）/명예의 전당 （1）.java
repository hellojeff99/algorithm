import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            result[i] = pq.peek();
        }
        return result;
    }
}