class Solution {
    public int[] solution(String myString) {
        myString += " ";
        String[] words = myString.split("x");
        
        int[] answer = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if (i == words.length - 1) len--;
            answer[i] = len;
        }
        return answer;
    }
}