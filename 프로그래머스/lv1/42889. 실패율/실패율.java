import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stay = new int[N + 2];
        for (int s: stages) stay[s]++;
        
        int players = stages.length;
        double[][] fail = new double[N][2];
        for (int i = 1; i <= N; i++) {
            double rate = 0.0;
            if (players > 0) rate = (double) stay[i] / players;
            fail[i - 1][0] = i;
            fail[i - 1][1] = rate;
            
            players -= stay[i];
        }
        Arrays.sort(fail, (a, b) -> {
            if (a[1] == b[1]) return Double.compare(a[0], b[0]);
            else return Double.compare(b[1], a[1]);
        });
        int[] result = new int[N];
        for (int i = 0; i < N; i++) result[i] = (int) fail[i][0];
        return result;
    }
}