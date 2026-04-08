class Solution {
    public long solution(long n) {
        double s = Math.sqrt((double) n);
        if (s % 1 > 0) return -1;
        int num = (int) s;
        return (long) (num + 1) * (num + 1);
    }
}