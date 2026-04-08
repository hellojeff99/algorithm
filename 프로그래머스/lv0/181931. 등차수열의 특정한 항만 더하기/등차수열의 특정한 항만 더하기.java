class Solution {
    public int solution(int a, int d, boolean[] included) {
        int value = a;
        int result = 0;
        for (boolean isAdd: included) {
            if (isAdd) result += value;
            value += d;
        }
        return result;
    }
}