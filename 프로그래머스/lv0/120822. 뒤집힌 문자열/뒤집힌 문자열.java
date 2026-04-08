class Solution {
    public String solution(String my_string) {
        String answer = "";
        int idx = my_string.length() - 1;
        for (int i = idx; i >= 0; i--) {
            answer += "" + my_string.charAt(i);
        }
        return answer;
    }
}