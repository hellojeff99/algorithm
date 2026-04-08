class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] rspArr = rsp.toCharArray();
        for (char c : rspArr) {
            if (c == '2') answer += "0";
            else if (c == '0') answer += "5";
            else if (c == '5') answer += "2";
        }
        return answer;
    }
}