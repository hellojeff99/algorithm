class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int count = 1;
        for (int num: section) {
            if (start + m - 1 < num) {
                count++;
                start = num;
            }
        }
        return count;
    }
}