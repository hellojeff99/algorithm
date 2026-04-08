class Solution {
    public int solution(String s) {
        char c = s.charAt(0);
        if (c == '-') return -1 * Integer.parseInt(s.substring(1));
        else if (c == '+') return Integer.parseInt(s.substring(1));
        else return Integer.parseInt(s);
    }
}