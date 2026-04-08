class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        return myString.contains(pat.toLowerCase()) ? 1 : 0;
    }
}