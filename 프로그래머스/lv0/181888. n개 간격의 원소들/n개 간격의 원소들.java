class Solution {
    public int[] solution(int[] num_list, int n) {
        int listLen = num_list.length;
        int len = listLen % n >= 1 ? listLen / n + 1 : listLen / n;
        int[] answer = new int[len];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[idx];
            idx += n;
        }
        return answer;
    }
}