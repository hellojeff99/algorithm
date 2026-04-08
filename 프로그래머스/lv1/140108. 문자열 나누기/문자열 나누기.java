class Solution {
    public int solution(String s) {
        char c = ' ';
        int a = 0, b = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == ' ') {
                c = s.charAt(i);
            }
            
            if (c == s.charAt(i)) a++;
            else b++;
            
            if (a == b) {
                c = ' ';
                result++;
            } else {
                if (i == s.length() - 1) result++;
            }
        }
        return result;
    }
}