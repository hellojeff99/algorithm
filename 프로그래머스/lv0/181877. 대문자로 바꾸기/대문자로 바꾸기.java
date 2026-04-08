class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char c : myString.toCharArray()) {
            if (Character.isLowerCase(c)) answer += "" + Character.toUpperCase(c);
            else answer += "" + c;
        }
        return answer;
    }
}