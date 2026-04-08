class Solution {
    public int[] solution(int brown, int yellow) {
        int square = brown + yellow;
        for (int i = 3; i*i <= square; i++) {
            int h = i;
            int w = square / h;
            if ((w - 2) * (h - 2) == yellow) return new int[]{w, h};
        }
        return new int[]{0, 0};
    }
}