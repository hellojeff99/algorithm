import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> st = new ArrayDeque<>();
        int result = 0;
        for (int m: moves) {
            int c = m - 1;
            int r = -1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][c] > 0) {
                    r = i;
                    break;
                }
            }
            if (r >= 0) {
                if (st.size() > 0 && st.peek() == board[r][c]) {
                    result += 2;
                    st.pop();
                } else {
                	st.push(board[r][c]);
                }
                board[r][c] = 0;
            }
        }
        return result;
    }
}