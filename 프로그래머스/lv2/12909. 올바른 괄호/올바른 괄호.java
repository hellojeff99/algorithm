import java.util.*;
class Solution {
    boolean solution(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (c == '(') st.push(c);
            else if (c == ')') {
                if (!st.isEmpty() && st.peek() == '(') st.pop();
                else return false;
            }
        }
        if (st.isEmpty()) return true;
        else return false;
    }
}