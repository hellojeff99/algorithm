import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        boolean[] isVisited = new boolean[n + 1];
        int[] distances = new int[n + 1];
        List<Integer>[] listArr = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) listArr[i] = new ArrayList<>();
        for (int[] e: edge) {
            listArr[e[0]].add(e[1]);
            listArr[e[1]].add(e[0]);
        }
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{1, 0});
        isVisited[1] = true;
        int max = 0;
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int currentNum = current[0];
            int currentDistance = current[1];
            max = currentDistance > max ? currentDistance : max;
            distances[currentNum] = currentDistance;
            for (int next: listArr[currentNum]) {
                if (isVisited[next] == false) {
                    q.offer(new int[]{next, currentDistance + 1});
                    isVisited[next] = true;
                }
            }
        }
        int count = 0;
        for (int d: distances) {
            if (max == d) count++;
        }
        return count;
    }
}