class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int x = i; x <= j; x++) {
            if (String.valueOf(x).contains(String.valueOf(k))) {
                for (char c: String.valueOf(x).toCharArray()) {
                    if (c - '0' == k) answer++;
                }
            }
        }
        return answer;
    }
}