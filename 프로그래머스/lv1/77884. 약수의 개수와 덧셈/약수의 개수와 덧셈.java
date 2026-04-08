class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int num = get(i);
            if (num % 2 == 0) result += i;
            else result -= i;
        }
        return result;
    }
    
    private int get(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) count++;
            }
        }
        return count;
    }
}