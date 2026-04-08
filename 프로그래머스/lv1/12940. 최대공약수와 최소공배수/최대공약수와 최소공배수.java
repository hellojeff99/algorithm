class Solution {
    public int[] solution(int n, int m) {
        int[] result = new int[2];
        result[0] = gcd(n, m);
        result[1] = n * m / result[0];
        return result;
    }
    
    private int gcd(int n, int m) {
        while (m > 0) {
            int mod = n % m;
            n = m;
            m = mod;
        }
        return n;
    }
}