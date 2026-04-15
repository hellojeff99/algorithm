import java.util.*;
class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        boolean[] isSpoiler = new boolean[message.length()];
        for (int[] range: spoiler_ranges) {
            for (int i = range[0]; i <= range[1]; i++) isSpoiler[i] = true;
        }
        
        Set<String> nonSpoilerSet = new HashSet<>();
        List<String> spoilerList = new ArrayList<>();
        boolean hasSpoiler = false;
        int start = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ' && isSpoiler[i]) hasSpoiler = true;
            if (i == message.length() - 1 || message.charAt(i) == ' ') {
                int end = i;
                if (i == message.length() - 1) end = i + 1;
                String word = message.substring(start, end);
                System.out.printf("[%s]", word);
                if (hasSpoiler) spoilerList.add(word);
                else nonSpoilerSet.add(word);
                start = i + 1;
                hasSpoiler = false;
            }
        }
        
        
        System.out.println("--");
        Set<String> importantSet = new HashSet<>();
        for (String word: spoilerList) {
            if (importantSet.contains(word) || nonSpoilerSet.contains(word)) continue;
            else {
                importantSet.add(word);
                System.out.println(word);
            }
        }
        return importantSet.size();
    }
}