class Solution {
    public String solution(String my_string, String alp) {
        char c = alp.charAt(0);
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) arr[i] -= 32;
        }
        return String.valueOf(arr);
    }
}