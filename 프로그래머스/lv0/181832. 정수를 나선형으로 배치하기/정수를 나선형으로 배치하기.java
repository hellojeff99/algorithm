class Solution {
    public int[][] solution(int n) {
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0;
        int c = 0;
        int d = 3;
        int[][] board = new int[n][n];
        for (int num = 1; num <= n * n; num++) {
            board[r][c] = num;
            int nr = r + dr[d];
            int nc = c + dc[d];
            if (nr < 0 || nc < 0 || nr >= n || nc >= n || board[nr][nc] != 0) {
                d = (d + 1) % 4;
                nr = r + dr[d];
                nc = c + dc[d];
            }
            r = nr;
            c = nc;
        }
        return board;
    }
}