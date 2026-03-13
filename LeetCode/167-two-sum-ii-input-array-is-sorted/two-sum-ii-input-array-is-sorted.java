class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = {0, 0};
        outLoop:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (i == j) continue;
                else {
                    if (numbers[i] + numbers[j] == target) {
                        a[0] = i + 1;
                        a[1] = j + 1;
                        break outLoop;
                    }
                }
            }
        }
        return a;
    }
}