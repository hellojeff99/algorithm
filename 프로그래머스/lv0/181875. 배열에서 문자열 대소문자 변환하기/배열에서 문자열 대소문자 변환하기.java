class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strArr[i].length(); j++) {
                if (i % 2 == 1) sb.append(Character.toUpperCase(strArr[i].charAt(j)));
                else sb.append(Character.toLowerCase((strArr[i].charAt(j))));
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}