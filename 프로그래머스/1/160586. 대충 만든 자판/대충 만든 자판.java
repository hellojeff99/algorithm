import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] keyCount = new int[26];
        Arrays.fill(keyCount, Integer.MAX_VALUE);
        for (String key: keymap) {
            for (int i = 0; i < key.length(); i++) {
                int idx = key.charAt(i) - 'A';
                keyCount[idx] = Math.min(keyCount[idx], i + 1);
            }
        }
        int[] result = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (char c: targets[i].toCharArray()) {
                int idx = c - 'A';
                if (keyCount[idx] == Integer.MAX_VALUE) {
                    count = -1;
                    break;
                } else {
                    count += keyCount[idx];
                }
            }
            result[i] = count;
        }
        return result;
    }
}