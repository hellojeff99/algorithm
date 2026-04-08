class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            int binary = arr1[i] | arr2[i];
            String str = Integer.toBinaryString(binary);
            str = "0".repeat(n - str.length()) + str;
            result[i] = str.replace("0", " ").replace("1", "#");
        }
        return result;
    }
}