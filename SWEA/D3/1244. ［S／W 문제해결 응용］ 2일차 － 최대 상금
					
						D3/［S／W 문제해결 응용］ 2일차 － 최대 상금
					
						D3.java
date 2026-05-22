import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    private static int max = 0;
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st = new StringTokenizer(br.readLine());
            String numstr = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());
            boolean[][] isVisited = new boolean[11][1000000];
            max = 0;
            dfs(cnt, numstr, isVisited);
            System.out.printf("#%d %d\n", test_case, max);
		}
	}
    private static void dfs(int cnt, String numstr, boolean[][] isVisited) {
        int num = Integer.parseInt(numstr);
        if (isVisited[cnt][num]) return;
        isVisited[cnt][num] = true;
        if (cnt == 0) {
            if (max < num) {
                max = num;
            }
            return;
        }
        char[] arr = numstr.toCharArray();
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i+1; j < arr.length; j++) {
                change(arr, i, j);
                String nextNumStr = String.valueOf(arr);
                int nextNum = Integer.parseInt(nextNumStr);
                if (!isVisited[cnt-1][nextNum]) dfs(cnt-1, nextNumStr, isVisited);
                change(arr, i, j);
            }
                
        }
    }
    private static void change(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}