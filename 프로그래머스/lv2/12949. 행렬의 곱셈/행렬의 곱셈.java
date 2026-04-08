class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int num = 0;
                for (int n = 0; n < arr1[0].length; n++) {
                    num += arr1[i][n]*arr2[n][j];
                }
                result[i][j] = num;
            }
        }
        return result;
    }
}