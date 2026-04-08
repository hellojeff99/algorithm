import java.util.*;
class Solution {
    private char[] arr;
    private boolean[] isUsed;
    private Set<Integer> set = new HashSet<>();
    private int count = 0;
    public int solution(String numbers) {
        arr = numbers.toCharArray();
        isUsed = new boolean[arr.length];
        StringBuilder sb = new StringBuilder();
        dfs(sb);
        return count;
    }
    private void dfs(StringBuilder sb) {
        for (int i = 0; i < arr.length; i++) {
            if (isUsed[i]) continue;
            
            isUsed[i] = true;
            sb.append(arr[i]);
            int num = Integer.parseInt(sb.toString());
            
            if (!set.contains(num)) {
                set.add(num);
                // check prime num ...
                boolean isPrime = true;
                if (num < 2) isPrime = false;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
            dfs(sb);
            isUsed[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}