class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int idx = 0;
        while (idx < 3) {
            if (date1[idx] < date2[idx]) {
                answer = 1;
                break;
            } else if (date1[idx] > date2[idx]) {
                answer = 0;
                break;
            }
            idx++;
        }
        return answer;
    }
}