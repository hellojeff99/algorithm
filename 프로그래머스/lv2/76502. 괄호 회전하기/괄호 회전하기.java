import java.util.*;
class Solution {
    public int solution(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int start = 0; start < arr.length; start++) {
            Deque<Character> st = new ArrayDeque<>();
            boolean isValid = true;
            for (int i = 0; i < arr.length; i++) {
                int idx = (start + i) % arr.length;
                if (st.isEmpty()) {
                    if (arr[idx] == ']' || arr[idx] == '}' || arr[idx] == ')') {
                        isValid = false;
                        break;
                    }
                    else {
                        st.push(arr[idx]);
                        continue;
                    }
                }
                else if (arr[idx] == '[' || arr[idx] == '{' || arr[idx] == '(') {
                    st.push(arr[idx]);
                    continue;
                }
                else {
                    if (arr[idx] == ']' && st.peek() == '[') {
                        st.pop();
                        continue;
                    }
                    else if (arr[idx] == '}' && st.peek() == '{') {
                        st.pop();
                        continue;
                    }
                    else if (arr[idx] == ')' && st.peek() == '(') {
                        st.pop();
                        continue;
                    }
                    else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid && st.isEmpty()) count++;
        }
        return count;
    }
}