import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        List<Integer>[] listArr = new ArrayList[n];
        boolean[] isVisited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) listArr[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if(computers[i][j] == 1) listArr[i].add(j);
            }
        }
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (isVisited[i]) continue;
            isVisited[i] = true;
            stack.push(i);
            count++;
            while (!stack.isEmpty()) {
                int pop = stack.pop();
                for (int num: listArr[pop]) {
                    if (isVisited[num]) continue;
                    stack.push(num);
                    isVisited[num] = true;
                }
            }
        }
        return count;
    }
}