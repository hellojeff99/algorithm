class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int temp = arr[q[0]];
            arr[q[0]] = arr[q[1]];
            arr[q[1]] = temp;
        }
        return arr;
    }
}