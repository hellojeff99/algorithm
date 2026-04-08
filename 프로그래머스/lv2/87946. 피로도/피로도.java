import java.util.*;
class Solution {
    private int max = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] isVisited = new boolean[dungeons.length];
        backtracking(k, isVisited, dungeons, 0);
        return max;
    }
    private void backtracking(int k, boolean[] isVisited, int[][] dungeons, int count) {
        this.max =  Math.max(count, this.max);
        if (k <= 0) return;
        for (int i = 0; i < dungeons.length; i++) {
            if (isVisited[i]) continue;
            
            if (k >= dungeons[i][0]) {
            	isVisited[i] = true;
                backtracking(k - dungeons[i][1], isVisited, dungeons, count + 1);
                
                isVisited[i] = false;
            }
        }
    }
}