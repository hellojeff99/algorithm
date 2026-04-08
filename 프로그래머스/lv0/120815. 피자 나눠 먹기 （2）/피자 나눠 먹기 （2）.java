class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = n;
        int b = 6;
        int mod = 1;
        while (mod >= 1) {
            mod = a % b;
            if (mod == 0) {
                answer = b;
                break;
            }
            a = b;
            b = mod;
        }
        answer = n / answer;
        return answer;
    }
}