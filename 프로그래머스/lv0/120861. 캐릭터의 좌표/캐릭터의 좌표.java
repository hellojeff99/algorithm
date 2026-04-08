class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;
        int[] point = new int[2];
        for (String key: keyinput) {
            switch (key) {
                case "left": if (maxX * -1 < point[0]) point[0]--;
                    break;
                case "right": if (maxX > point[0]) point[0]++;
                    break;
                case "up": if (maxY > point[1]) point[1]++;
                    break;
                case "down": if (maxY * -1 < point[1])point[1]--;
                    break;
            }
        }
        return point;
    }
}