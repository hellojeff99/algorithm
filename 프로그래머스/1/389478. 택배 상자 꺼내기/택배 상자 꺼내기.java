class Solution {
    public int solution(int n, int w, int num) {
        int[][] boxes = new int[(n-1)/w + 1][w];
        int c = 0;
        int r = 0;
        int numc = 0;
        int numr = 0;
        for (int i = 1; i <= n; i++) {
            boxes[r][c] = i;
            if (i == num) {
                numc = c;
                numr = r;
            }
            if (r%2 == 0) c++;
            else c--;
            if (c == -1) {
                c = 0;
                r++;
            } else if (c == w) {
                c = w - 1;
                r++;
            }
        }
        int result = 0;
        for (int i = numr; i < boxes.length; i++) {
            if (boxes[i][numc] != 0) result++;
        }
        return result;
    }
}