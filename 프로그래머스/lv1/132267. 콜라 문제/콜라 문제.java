class Solution {
    public int solution(int a, int b, int n) {
        int count = 0;
        while (n >= a) {
            int exchange = n / a;
            n -= a * exchange;
            n += b * exchange;
            count += b * exchange;
        }
        return count;
    }
}