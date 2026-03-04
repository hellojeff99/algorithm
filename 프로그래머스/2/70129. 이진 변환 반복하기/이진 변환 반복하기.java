class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int count = 0;
        while (!s.equals("1")) {
            int num = 0;
            for (char c: s.toCharArray()) {
                if (c == '1') num++;
                else zero++;
            }
            s = Integer.toBinaryString(num);
            count++;
        }
        return new int[]{count, zero};
    }
}