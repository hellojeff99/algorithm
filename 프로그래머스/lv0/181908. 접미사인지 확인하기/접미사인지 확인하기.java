class Solution {
    public int solution(String my_string, String is_suffix) {
        int idx = my_string.length() - is_suffix.length();
        if (idx < 0) return 0;
        for (int i = idx; i < my_string.length(); i++) {
            if (my_string.charAt(i) != is_suffix.charAt(i - idx)) return 0;
        }
        return 1;
    }
}