class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        for (int[] line: lines) {
            int s = line[0] + 100;
            int e = line[1] + 100;
            for (int i = s; i < e; i++) arr[i]++;
        }
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) answer++;
        }
        return answer;
    }
}