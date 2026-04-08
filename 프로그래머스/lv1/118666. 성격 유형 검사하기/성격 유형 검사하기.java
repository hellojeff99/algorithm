import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        int n = survey.length;
        for (int i = 0; i < n; i++) {
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);
            if (choices[i] == 4) continue;
            else if (choices[i] < 4) map.merge(a, 4 - choices[i], Integer::sum);
            else if (choices[i] > 4) map.merge(b, choices[i] - 4, Integer::sum);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getChar(map, 'R', 'T'));
        sb.append(getChar(map, 'C', 'F'));
        sb.append(getChar(map, 'J', 'M'));
        sb.append(getChar(map, 'A', 'N'));
        return sb.toString();
    }
    private char getChar(Map<Character, Integer> map, char a, char b) {
        if (map.getOrDefault(a, 0) >= map.getOrDefault(b, 0)) return a;
        else return b;
    }
}