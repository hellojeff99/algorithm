class Solution {
    public boolean solution(int x) {
        int num = 0;
        int number = x;
        while (x > 0) {
            num += x % 10;
            x /= 10;
        }
        if (number % num == 0) return true;
        else return false;
        
    }
}