class Solution {
    public int solution(int a, int b) {
        String input = "" + a + b;
        int x = Integer.parseInt(input);
        int y = 2 * a * b;
        if (x > y) return x;
        else return y;
    }
}