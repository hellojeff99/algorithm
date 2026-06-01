class Solution {
    private boolean[] isUsed;
    private int n = -1;;
    private int result = Integer.MAX_VALUE;
    private String target = "";
    private String[] words;
    public int solution(String begin, String target, String[] words) {
        this.words = words;
        this.target = target;
        n = words.length;
        isUsed = new boolean[n];
        
        dfs(begin, 0);
        return result == Integer.MAX_VALUE ? 0 : result;
    }
    
    private void dfs(String w, int count) {
        if (w.equals(target)) {
            if (count < result) result = count;
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (isUsed[i]) continue;
            if (checkDiff(w, words[i])) {
                isUsed[i] = true;
                dfs(words[i], count + 1);
                
                isUsed[i] = false;
            }
        }
    }
    
    private boolean checkDiff(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
            if (count > 1) return false;
        }
        return true;
    }
}