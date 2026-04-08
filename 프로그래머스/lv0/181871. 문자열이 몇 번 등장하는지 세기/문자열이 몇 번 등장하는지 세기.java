class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.startsWith(pat, i)) answer++;
        }
        return answer;
    }
}