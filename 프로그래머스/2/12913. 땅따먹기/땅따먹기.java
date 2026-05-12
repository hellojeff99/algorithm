class Solution {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }
        int idx = land.length - 1;
        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (result < land[idx][i]) result = land[idx][i];
        }
        return result;
    }
}