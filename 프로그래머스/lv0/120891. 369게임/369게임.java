class Solution {
    public int solution(int order) {
        char[] arr = String.valueOf(order).toCharArray();
        int answer = 0;
        for (char c: arr) {
            int n = c - '0';
            if (n != 0 && n % 3 == 0) answer++;
        }
        return answer;
    }
}