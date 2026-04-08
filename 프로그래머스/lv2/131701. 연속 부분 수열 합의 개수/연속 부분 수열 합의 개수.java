import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for (int count = 1; count <= elements.length; count++) {
            for (int start = 0; start < elements.length; start++) {
                int sum = 0;
                for (int i = 0; i < count; i++) {
                    int idx = (start + i) % elements.length;
                    sum += elements[idx];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}