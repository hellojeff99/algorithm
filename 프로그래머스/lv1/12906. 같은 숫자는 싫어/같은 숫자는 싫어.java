import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        int prev = arr[0];
        answer.add(prev);
        for (int i = 1; i < arr.length; i++) {
            if (prev != arr[i]) {
                answer.add(arr[i]);
                prev = arr[i];
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
        
    }
}

