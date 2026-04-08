class Solution {
    public int solution(int number, int limit, int power) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            int factor = getFactorCount(i);
            if (factor > limit) result += power;
            else result += factor;
        }
        return result;
    }
    private int getFactorCount(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) count++;
            }
        }
        return count;
    }
}