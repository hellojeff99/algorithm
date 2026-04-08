class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        sb.reverse();
        int p = 0;
        int result = 0;
        for (char c: sb.toString().toCharArray()) {
            result += (int) Math.pow(3, p) * (c - '0');
            p++;
        }
        return result;
    }
}