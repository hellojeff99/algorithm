import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] < prices[st.peek()]) {
                int idx = st.pop();
                result[idx] = i - idx;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int idx = st.pop();
            result[idx] = prices.length - idx - 1;
        }
        return result;
    }
}