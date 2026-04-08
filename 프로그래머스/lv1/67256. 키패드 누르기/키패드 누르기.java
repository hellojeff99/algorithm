class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int cl = 10;
        int cr = 12;
        for (int n: numbers) {
            int num = n;
            if (num == 0) num = 11;
            switch (num) {
                case 1, 4, 7:
                    sb.append("L");
                    cl = num;
                    break;
                case 3, 6, 9:
                    sb.append("R");
                    cr = num;
                    break;
                default:
                    int ld = getDistance(cl, num);
                    int rd = getDistance(cr, num);
                    if (ld == rd) {
                        if (hand.equals("left")) {
                            sb.append("L");
                            cl = num;
                        } else {
                            sb.append("R");
                            cr = num;
                        }
                    } else if (ld < rd) {
                        sb.append("L");
                        cl = num;
                    } else {
                        sb.append("R");
                        cr = num;
                    }
            }
        }
        return sb.toString();
    }
    private int getDistance(int cur, int des) {
        cur--;
        des--;
        int r = Math.abs(cur/3 - des/3);
        int c = Math.abs(cur%3 - des%3);
        return r + c;
    }
}