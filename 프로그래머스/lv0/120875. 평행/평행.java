class Solution {
    public int solution(int[][] dots) {
        double a = incline(dots[0], dots[1]);
        double b = incline(dots[2], dots[3]);
        double aa = incline(dots[0], dots[2]);
        double bb = incline(dots[1], dots[3]);
        double aaa = incline(dots[0], dots[3]);
        double bbb = incline(dots[1], dots[2]);
        if (a == b || aa == bb || aaa == bbb) return 1;
        else return 0;
    }
    private double incline(int[] a, int[] b) {
        double c = (double) a[0] - b[0];
        double p = (double) a[1] - b[1];
        return c / p;
    }
}