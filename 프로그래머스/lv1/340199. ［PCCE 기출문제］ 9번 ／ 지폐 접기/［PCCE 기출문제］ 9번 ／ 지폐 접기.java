class Solution {
    public int solution(int[] wallet, int[] bill) {
        int wl = Math.max(wallet[0], wallet[1]);
        int ws = Math.min(wallet[0], wallet[1]);
        
        int l = Math.max(bill[0], bill[1]);
        int s = Math.min(bill[0], bill[1]);
        int count = 0;
        while (l > wl || s > ws) {
            l /= 2;
            count++;
            int max = Math.max(l, s);
            int min = Math.min(l, s);
            l = max;
            s = min;
        }
        return count;
    }
}