class Solution {
    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int answer = 0;
        int dec = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Character.isDigit(arr[i])) {
                answer += (arr[i] - '0') * dec;
                dec *= 10;
            } else dec = 1;
        }
        return answer;
    }
}