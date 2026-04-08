class Solution {
    public int solution(int[] array, int n) {
        int diff = Integer.MAX_VALUE;
        int answer = array[0];
        for (int num: array) {
            if (Math.abs(n - num) < diff) {
                answer = num;
                diff = Math.abs(n - num);
            }
            else if (Math.abs(n - num) == diff) {
                answer = answer > num ? num : answer;
            }
        }
        return answer;
    }
}