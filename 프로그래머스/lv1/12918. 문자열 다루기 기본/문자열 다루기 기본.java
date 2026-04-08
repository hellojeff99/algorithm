class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        char[] arr = s.toCharArray();
        for (char c: arr) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}