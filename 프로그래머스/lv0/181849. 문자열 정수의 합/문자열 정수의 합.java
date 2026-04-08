class Solution {
    public int solution(String num_str) {
        char[] arr = num_str.toCharArray();
        int result = 0;
        for (char c : arr) {
            result += c - '0';
        }
        return result;
    }
}