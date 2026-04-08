class Solution {
    public int solution(int[][] triangle) {
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                int left = -1;
                int right = -1;
                if (j > 0) {
                    left = triangle[i - 1][j - 1] + triangle[i][j];
                }
                if (j < triangle[i - 1].length) {
                    right = triangle[i - 1][j] + triangle[i][j];
                }
                triangle[i][j] = left > right ? left : right;
            }
        }
        int[] arr = triangle[triangle.length - 1];
        int max = -1;
        for (int num: arr) max = num > max ? num : max;
        return max;
    }
}