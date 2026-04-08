class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int s = q[0];
            int e = q[1];
            int k = q[2];
            int v = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] <= k) continue;
                v = v > arr[j] ? arr[j] : v;
            }
            if (v == Integer.MAX_VALUE) v = -1;
            result[i] = v;
        }
        return result;
    }
}