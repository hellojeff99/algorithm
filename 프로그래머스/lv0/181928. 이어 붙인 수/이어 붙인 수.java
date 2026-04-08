class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for (int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            if (num % 2 == 0) even += "" + num;
            else odd += "" + num;
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}