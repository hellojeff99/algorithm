class Solution {
    public String solution(String s) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c == ' ') {
                idx = 0;
                sb.append(" ");
                continue;
            }
            if (idx % 2 == 0) {
                sb.append(Character.toUpperCase(c));
            }
            else {
                sb.append(Character.toLowerCase(c));
            }
            idx++;
        }
        return sb.toString();
    }
}