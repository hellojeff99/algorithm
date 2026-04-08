import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
            if (set.size() >= k) break;
        }
        
        int[] result = new int[k];
        int idx = 0;
        for (int i : set) {
            result[idx++] = i;
        }
        for (int i = idx; i < k; i++) result[i] = -1;
        
        return result;
    }
}