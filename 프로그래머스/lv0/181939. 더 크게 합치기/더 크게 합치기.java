class Solution {
    public int solution(int a, int b) {
        String ab = "" + a + b;
        String ba = "" + b + a;
        
        int x = Integer.parseInt(ab);
        int y = Integer.parseInt(ba);
        if (x > y) return x;
        else return y;
    }
}