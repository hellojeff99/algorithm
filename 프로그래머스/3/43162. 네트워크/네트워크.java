class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] isVisited = new boolean[n];
        int count = 0;
        
        for (int i = 0; i < computers.length; i++) {
            if (isVisited[i]) continue;
            count++;
            dfs(i, computers, isVisited);
        }
        return count;
    }
    
    private void dfs(int cur, int[][] computers, boolean[] isVisited) {
        isVisited[cur] = true;
        int[] arr = computers[cur];
        for (int next = 0; next < arr.length; next++) {
            if (cur == next) continue;
            if (isVisited[next]) continue;
            if (computers[cur][next] == 1) dfs(next, computers, isVisited);
        }
    }
}