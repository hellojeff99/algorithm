class Solution {
    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];
        for (char c: X.toCharArray()) x[c - '0']++;
        for (char c: Y.toCharArray()) y[c - '0']++;
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(x[i], y[i]);
            for (int j = 0; j < min; j++) sb.append(i);
        }
        String result = sb.toString();
        if (result.startsWith("0")) return "0";
        else if (result.equals("")) return "-1";
        else return result;
    }
}