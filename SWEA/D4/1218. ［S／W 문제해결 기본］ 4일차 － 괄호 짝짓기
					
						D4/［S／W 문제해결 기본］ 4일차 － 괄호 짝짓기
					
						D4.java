import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int test_case = 1; test_case <= 10; test_case++) {
            
            String lenLine = br.readLine();
            if (lenLine == null) break;
            int len = Integer.parseInt(lenLine.trim());

            String str = br.readLine().trim();

            char[] stack = new char[len];
            int top = -1;
            
            int result = 1;

            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);

                if (c == '(' || c == '[' || c == '{' || c == '<') {
                    stack[++top] = c;
                } 
                else {
                    if (top == -1) {
                        result = 0;
                        break;
                    }

                    char open = stack[top];

                    if ((c == ')' && open == '(') ||
                        (c == ']' && open == '[') ||
                        (c == '}' && open == '{') ||
                        (c == '>' && open == '<')) {
                        top--;
                    } else {
                        result = 0;
                        break;
                    }
                }
            }

            if (top != -1) {
                result = 0;
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}