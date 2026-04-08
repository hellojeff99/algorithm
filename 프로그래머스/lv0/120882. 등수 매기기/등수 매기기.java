import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] avgs = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            avgs[i] = score[i][0] + score[i][1];
        }
        int[] answer = new int[score.length];
        Arrays.fill(answer, 1);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (avgs[i] < avgs[j]) answer[i]++;
            }
        }
        return answer;
    }
}