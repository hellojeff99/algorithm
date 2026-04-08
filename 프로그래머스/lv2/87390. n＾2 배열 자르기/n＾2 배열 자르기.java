class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left + 1);
        int[] result = new int[len];
        int cR = (int) ((left - 1)/n);
        int cC = (int) (left % n);
        for (int i = 0; i < result.length; i++) {
            int max = Math.max(cR + 1, cC + 1);
            result[i] = max;
            cC++;
            if (cC >= n) {
                cC = 0;
                cR++;
            }
        }
        return result;
    }
}