import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        int i = 0;
        while (i < arr.length) {
            if (dq.isEmpty()) dq.push(arr[i++]);
            else if (dq.peek() == arr[i]) {
                dq.pop();
                i++;
            }
            else if (dq.peek() != arr[i]) {
                dq.push(arr[i++]);
            }
        }
        if (dq.size() == 0) return new int[]{-1};
        int[] result = new int[dq.size()];
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = dq.pop();
        }
        return result;
    }
}