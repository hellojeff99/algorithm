class Solution {
    public int solution(int[][] signals) {
        int[] cycles = new int[signals.length];
        for (int i = 0; i < signals.length; i++) {
            for (int s: signals[i]) cycles[i] += s;
        }
        int lcm = 1;
        for (int c: cycles) lcm = getLcm(lcm, c);
        
        int[] starts = new int[signals.length];
        for (int i = 0; i < signals.length; i++) starts[i] = signals[i][0];
        
        for (int time = 1; time <= lcm; time++) {
            boolean isYellow = true;
            for (int i = 0; i < signals.length; i++) {
                int color = time%cycles[i];
                if (starts[i] <= color && color < starts[i] + signals[i][1]) continue;
                else {
                    isYellow = false;
                    break;
                }
            }
            if (isYellow) {
                return time + 1;
            }
        }
        return -1;
    }
    
    private int getLcm(int a, int b) {
        int x = a;
        int y = b;
        while (y > 0) {
            int temp = x;
            x = y;
            y = temp%y;
        }
        return a*b/x;
    }
}