class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        boolean isUpper = true;
        boolean isBlank = false;
        StringBuilder sb = new StringBuilder();
        for (char c: arr) {
            if (c == ' ') {
                if (isBlank == false) {
                    sb.append(" ");
                    isUpper = true;
                }
            }
            else {
                isBlank = false;
                if (isUpper == true) {
                    sb.append(Character.toUpperCase(c));
                    isUpper = false;
                }
                else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}