class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> lettersMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            lettersMap.put(c, lettersMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (lettersMap.containsKey(c) && lettersMap.get(c) > 0) {
                lettersMap.put(c, lettersMap.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
        
    }
}