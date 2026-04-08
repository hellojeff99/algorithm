class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int adx = 0;
        int bdx = 0;
        for (String word: goal) {
            if (adx < cards1.length && word.equals(cards1[adx])) {
                adx++;
                continue;
            }
            else if (bdx < cards2.length && word.equals(cards2[bdx])) {
                bdx++;
                continue;
            }
            else return "No";
        }
        return "Yes";
    }
}