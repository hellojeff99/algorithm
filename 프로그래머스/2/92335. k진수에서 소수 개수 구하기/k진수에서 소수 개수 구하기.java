class Solution {
    public int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n%k);
            n /= k;
        }
        String str = sb.reverse().toString();
        String[] arr = str.split("0+");
        int result = 0;
        for (String part: arr) {
            if (part.isEmpty()) continue;
            long num = Long.parseLong(part);
            if (num >= 2) {
                boolean isPrime = true;
                for (long i = 2; i <= Math.sqrt(num); i++) {
                    if (num%i == 0) isPrime = false;
                }
                if (isPrime) result++;
            }
        }
        
        return result;
    }
}