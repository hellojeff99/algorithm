class Solution {
    public int solution(int n) {
        int i = 1;
        int fact = 1;
        while (fact <= n) {
            i++;
            fact *= i;
        }
        return i - 1;
    }
}