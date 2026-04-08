class Solution {
    public int solution(int n) {
        int v = 0;
        for (int i = 0; i < n; i++) {
            v++;
            while (v % 3 == 0 || String.valueOf(v).contains("3")) v++;
        }
        return v;
    }
}