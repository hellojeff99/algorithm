class Solution {
    public int solution(int num, int k) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - '0' == k) return i + 1;
        }
        return -1;
    }
}