class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] board = new int[n + 1][m + 1];
        for (int p[]: puddles) board[p[1]][p[0]] = -1;
        board[1][1] = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= m; c++) {
                if (r == 1 && c == 1) continue;
                if (board[r][c] == -1) {
                    board[r][c] = 0;
                    continue;
                }
                board[r][c] = (board[r - 1][c] + board[r][c - 1]) % 1000000007;
            }
        }
        return board[n][m];
    }
}