class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] arr = cipher.toCharArray();
        int idx = code - 1;
        while (idx < arr.length) {
            sb.append(arr[idx]);
            idx += code;
        }
        return sb.toString();
    }
}