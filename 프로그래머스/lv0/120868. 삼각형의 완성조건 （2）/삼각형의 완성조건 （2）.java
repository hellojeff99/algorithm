class Solution {
    public int solution(int[] sides) {
        int l = 0, s = 0;
        if (sides[0] > sides[1]) {
            l = sides[0];
            s = sides[1];
        }
        else {
            l = sides[1];
            s = sides[0];
        }
        return 2*s - 1;
        
    }
}