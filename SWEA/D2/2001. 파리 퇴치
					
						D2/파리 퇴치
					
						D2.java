import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] board = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int max = 0;
            for (int i = 0; i < n-m+1; i++) {
                for (int j = 0; j < n-m+1; j++) {
                    int cnt = 0;
                    for (int x = 0; x < m; x++) {
                        for (int y = 0; y < m; y++) {
                            cnt += board[i+x][j+y];
                        }
                    }
                    if (max < cnt) max = cnt;
                }
            }
            
            System.out.printf("#%d %d\n", test_case, max);
		}
	}
}