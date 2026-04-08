import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int a = numbers[0] * numbers[1];
        int len = numbers.length;
        int b = numbers[len - 1] * numbers[len - 2];
        return a > b ? a : b;
    }
}