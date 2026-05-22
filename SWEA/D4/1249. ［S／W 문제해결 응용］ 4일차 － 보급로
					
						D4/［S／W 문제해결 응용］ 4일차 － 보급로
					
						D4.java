import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Arrays;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(br.readLine());
            
            int[][] board = new int[n][n];
            for (int i = 0; i < n; i++) {
                char[] arr = br.readLine().toCharArray();
                for (int j = 0; j < n; j++) {
                    board[i][j] = arr[j] - '0';
                }
            }
            
            int[][] dist = new int[n][n];
            for (int i = 0; i < n; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[0][0] = 0;
            
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};
            
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
            pq.offer(new int[]{0, 0, 0});
            
            int result = 0;
            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                int r = current[0];
                int c = current[1];
                int w = current[2];
                
                if (r == n-1 && c == n-1) {
                    result = dist[r][c];
                    break;
                }
                if (dist[r][c] < w) continue;
                
                for (int i = 0; i < 4; i++) {
                    int nr = r +dr[i];
                    int nc = c + dc[i];
                    if (0 <= nr && nr < n && 0 <= nc && nc < n) {
                        int nw = w + board[nr][nc];
                        if (dist[nr][nc] > nw) {
                            dist[nr][nc] = nw;
                            pq.offer(new int[]{nr, nc, nw});
                        }
                    }
                }
            }
            System.out.printf("#%d %d\n", test_case, dist[n-1][n-1]);
        }
    }
}