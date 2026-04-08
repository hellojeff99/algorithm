class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String str: arr) {
            int num = Integer.parseInt(str);
            if (num > max) max = num;
			if (num < min) min = num;
        }
        return String.format("%d %d", min, max);
    }
}