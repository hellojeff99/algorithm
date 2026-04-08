class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long value = (long) x;
        long num = (long) x;
        for (int i = 0; i < n; i++) {
            answer[i] = value;
            value += num;
        }
        return answer;
    }
}