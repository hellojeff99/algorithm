class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int idx = 0;
        int count = 0;
        while (count < t) {
            String str = getStr(num, n);
            for (int i = 0; i < str.length(); i++) {
                if (idx%m + 1 == p) {
                    sb.append(str.charAt(i));
                    count++;
                    if (count >= t) break;
                }
                idx++;
            }
            num++;
        }
        return sb.toString();
    }
    private String getStr(int num, int n) {
        if (num == 0) return "0";
        String str = "0123456789ABCDEF";
        String txt = str.substring(0, n);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(txt.charAt(num%n));
            num /= n;
        }
        return sb.reverse().toString();
    }
}