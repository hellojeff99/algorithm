class Solution {
    public int solution(String t, String p) {
        int result = 0;
        int tlen = t.length();
        int plen = p.length();
        long pNum = Long.parseLong(p);
        for (int i = 0; i <= tlen - plen; i++) {
            String part = t.substring(i, plen + i);
            long partNum = Long.parseLong(part);
            if (partNum <= pNum) result++;
        }
        return result;
    }
}