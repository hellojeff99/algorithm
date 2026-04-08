class Solution {
    public int solution(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int result = 0;
        for (char c : arr) {
            result += c - '0';
        }
        return result;
    }
}