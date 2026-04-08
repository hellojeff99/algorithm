class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < answer.length - 1; i++) {
            answer[i] = num_list[i];
        }
        int lastIdx = num_list.length - 1;
        int temp = 0;
        if (num_list[lastIdx] > num_list[lastIdx - 1] ) {
            temp = num_list[lastIdx] - num_list[lastIdx - 1];
        }
        else temp = num_list[lastIdx] * 2;
        answer[answer.length - 1] = temp;
        return answer;
    }
}