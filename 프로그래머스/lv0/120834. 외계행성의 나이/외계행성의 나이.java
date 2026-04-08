class Solution {
    public String solution(int age) {
        String strAge = String.valueOf(age);
        String letters = "abcdefghij";
        String result = "";
        for (int i = 0; i < strAge.length(); i++) {
            int num = strAge.charAt(i) - '0';
            result += letters.charAt(num);
        }
        return result;
    }
}