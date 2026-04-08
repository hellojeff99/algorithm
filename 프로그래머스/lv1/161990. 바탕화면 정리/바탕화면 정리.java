class Solution {
    public int[] solution(String[] wallpaper) {
        int minr = Integer.MAX_VALUE, minc = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE, maxc = Integer.MIN_VALUE;
        for (int r = 0; r < wallpaper.length; r++) {
            for (int c = 0; c < wallpaper[r].length(); c++) {
               if (wallpaper[r].charAt(c) == '#') {
                   if (minr > r) minr = r;
                   if (minc > c) minc = c;
                   if (maxr < r) maxr = r;
                   if (maxc < c) maxc = c;
               } 
            }
        }
        return new int[]{minr, minc, maxr + 1, maxc + 1};
    }
}