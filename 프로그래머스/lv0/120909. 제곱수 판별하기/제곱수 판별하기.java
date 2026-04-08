class Solution {
    public int solution(int n) {
        int a = (int) Math.sqrt(n);
        if (a * a == n) return 1;
        else return 2;
    }
}