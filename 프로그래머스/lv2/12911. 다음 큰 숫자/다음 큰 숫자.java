class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n++);
        while (Integer.bitCount(n) != count) n++;
        return n;
    }
}