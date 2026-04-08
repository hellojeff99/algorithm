import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations[i];
            int count = citations.length - i;
            if (h >= count) return count;
        }
        return 0;
    }
}