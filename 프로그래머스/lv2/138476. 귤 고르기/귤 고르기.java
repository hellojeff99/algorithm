import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> sizes = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            sizes.put(tangerine[i], sizes.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(sizes.values());
        counts.sort(Collections.reverseOrder());
        
        int basket = 0;
        for (int i : counts) {
            basket += i;
            answer++;
            if (basket >= k) break;
        }
        return answer;
    }
}