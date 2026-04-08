class Solution {
    public String[] solution(String[] names) {
        int len = (names.length + 4) / 5;
        String[] answer = new String[len];
        for (int i = 0; i < len; i++) answer[i] = names[i * 5]; 
        return answer;
    }
}