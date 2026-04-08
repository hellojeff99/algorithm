class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for (char c: s.toCharArray()) {
            if (c == 'p') p++;
            else if (c == 'y') y++;
        }
        if (p == y) return true;
        else return false;
    }
}