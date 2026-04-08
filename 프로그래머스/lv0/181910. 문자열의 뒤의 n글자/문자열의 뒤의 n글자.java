class Solution {
    public String solution(String my_string, int n) {
        int start = my_string.length() - n;
        return my_string.substring(start, start + n);
    }
}