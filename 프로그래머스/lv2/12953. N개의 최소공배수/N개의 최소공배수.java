class Solution {
    public int solution(int[] arr) {
        if (arr.length == 1) return arr[0];
        int num = multiple(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            num = multiple(num, arr[i]);
        }
        return num;
    }
    private int multiple(int a, int b) {
        int n = a;
        int m = b;
        int mod = a % b;
        while (mod > 0) {
            a = b;
            b = mod;
            mod = a % b;
        }
        return m*n/b;
    }
}