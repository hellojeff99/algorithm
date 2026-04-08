class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] arr = control.toCharArray();
        for (char c : arr) {
            if (c == 'w') answer += 1;
            else if (c == 's') answer -= 1;
            else if (c == 'd') answer += 10;
            else if (c == 'a') answer -= 10;
        }
        return answer;
    }
}