class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = 0;
        if (n % 2 == 0) {
            idx = 2;
            while (idx <= n) {
                answer += Math.pow(idx, 2);
                idx += 2;
            }
        }
        else {
            idx = 1;
            while (idx <= n) {
                answer += idx;
                idx += 2;
            }
        }
        return answer;
    }
}