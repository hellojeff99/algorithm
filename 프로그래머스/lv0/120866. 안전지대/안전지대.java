class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        boolean[][] danger = new boolean[n][n];
        int[] dr = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    danger[i][j] = true;
                    for (int d = 0; d < 8; d++) {
                        int nr = i + dr[d];
                        int nc = j + dc[d];
                        if (0 <= nr && nr < n && 0 <= nc && nc < n) {
                            danger[nr][nc] = true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (danger[i][j] == false) answer++;
            }
        }
        return answer;
    }
}