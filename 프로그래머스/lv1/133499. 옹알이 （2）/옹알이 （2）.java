class Solution {
    public int solution(String[] babbling) {
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        int count = 0;
        for (String str: babbling) {
            int prev = -1;
            while (!str.isEmpty()) {
                boolean isMatched = false;
                for (int i = 0; i < words.length; i++) {
                    if (str.startsWith(words[i]) && prev != i) {
                        str = str.substring(words[i].length());
                        prev = i;
                        isMatched = true;
                        break;
                    }
                }
                if (!isMatched) break;
                
                if (str.length() == 0) count++;
            }
        }
        return count;
    }
}