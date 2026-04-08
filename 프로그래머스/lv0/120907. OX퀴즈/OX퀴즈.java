class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            int x = Integer.parseInt(q[0]);
            int y = Integer.parseInt(q[2]);
            int z = Integer.parseInt(q[4]);
            String op = q[1];
            if (op.equals("+") && x + y == z) answer[i] = "O";
            else if (op.equals("-") && x - y == z) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}