class Solution {
    public int solution(int hp) {
        int a = hp / 5;
        hp %= 5;
        int b = hp / 3;
        hp %= 3;
        int c = hp / 1;
        return a + b + c;
    }
}