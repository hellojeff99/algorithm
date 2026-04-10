import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        Integer[] arr = new Integer[mats.length];
        for (int i = 0; i < mats.length; i++) arr[i] = mats[i];
        Arrays.sort(arr, Collections.reverseOrder());
        int max = -1;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                if (park[i][j].equals("-1")) {
                    for (int size: arr) {
                        if (i + size - 1 >= park.length) continue;
                        if (j + size - 1 >= park[0].length) continue;
                        boolean isAvailable = true;
                        loop:
                        for (int y = i; y < i + size; y++) {
                            for (int x = j; x < j + size; x++) {
                                if (!park[y][x].equals("-1")) {
                                    isAvailable = false;
                                    break loop;
                                }
                            }
                        }
                        if (isAvailable) {
                            max = Math.max(size, max);
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }
}