class Solution {
    public int solution(String myString, String pat) {
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') arr[i] = 'B';
            else if (arr[i] == 'B') arr[i] = 'A';
        }
        return String.valueOf(arr).contains(pat) ? 1 : 0;
    }
}