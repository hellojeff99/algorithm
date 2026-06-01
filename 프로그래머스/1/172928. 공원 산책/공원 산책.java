class Solution {
    public int[] solution(String[] park, String[] routes) {
        boolean[][] board = new boolean[park.length][park[0].length()];
        int cr = -1;
        int cc = -1;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) != 'X') {
                    if (park[i].charAt(j) == 'S') {
                        cr = i;
                        cc = j;
                    }
                    board[i][j] = true;
                }
            }
        }
        int[] dr = new int[]{-1, 1, 0, 0};
        int[] dc = new int[]{0, 0, -1, 1};
        int op = -1;
        for (String r: routes) {
            String[] arr = r.split(" ");
            switch (arr[0]) {
                case "N": op = 0;
                    break;
                case "S": op = 1;
                    break;
                case "W": op = 2;
                    break;
                case "E": op = 3;
                    break;
            }
            int n = Integer.parseInt(arr[1]);
            
            boolean isAvailable = true;
            int nr = cr;
            int nc = cc;
            for (int i = 0; i < n; i++) {
                nr += dr[op];
                nc += dc[op];
                if (nr < 0 || nr >= board.length || nc < 0 || nc >= board[0].length ||
                   board[nr][nc] == false) {
                    isAvailable = false;
                    break;
                }
            }
            if (isAvailable) {
                cr = nr;
                cc = nc;
            }
        }
        return new int[]{cr, cc};
    }
}