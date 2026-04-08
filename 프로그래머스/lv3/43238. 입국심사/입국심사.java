class Solution {
    public long solution(int n, int[] times) {
        long max = 0;
        for (int time: times) max = Math.max(max, time);
        long left = 0;
        long right = max * n;
        long result = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            for (int time: times) count += mid / time;
            if (count >= n) {
                result = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
}