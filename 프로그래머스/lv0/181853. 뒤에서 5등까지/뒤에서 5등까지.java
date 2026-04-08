import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = num_list[i];
        }
        return result;
    }
}