class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            product *= num;
            sum += num;
        }
        if (product < Math.pow(sum, 2)) return 1;
        else return 0;
    }
}