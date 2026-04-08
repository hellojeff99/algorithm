class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int n: array) {
            String numstr = String.valueOf(n);
            if (numstr.contains("7")) {
                for (char c: numstr.toCharArray()) {
                    if (c - '0' == 7) answer++;
                }
            }
        }
        return answer;
    }
}