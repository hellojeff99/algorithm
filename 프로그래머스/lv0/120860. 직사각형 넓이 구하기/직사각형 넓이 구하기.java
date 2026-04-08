class Solution {
    public int solution(int[][] dots) {
        int[] a = dots[0];
        int[] b = new int[2];
        for (int[] dot: dots) {
            if (dot[0] != a[0] && dot[1] != a[1]) {
                return Math.abs(dot[0] - a[0]) * Math.abs(dot[1] - a[1]);
            }
        }
        return 0;
    }
}