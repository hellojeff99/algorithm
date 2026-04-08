class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length];
        int idx = num_list.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num_list[idx];
            idx--;
        }
        return arr;
    }
}