import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (alphabet[idx] == -1) {
                answer[i] = -1;
                alphabet[idx] = i;
            }
            else {
                answer[i] = i - alphabet[idx];
                alphabet[idx] = i;
            }
        }
        return answer;
    }
}