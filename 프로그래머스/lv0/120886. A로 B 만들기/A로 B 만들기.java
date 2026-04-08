class Solution {
    public int solution(String before, String after) {
        for (char c: before.toCharArray()) {
            if (after.contains(String.valueOf(c))) {
                after = after.replaceFirst(String.valueOf(c), "");
            } else return 0;
        }
        return 1;
        
    }
}