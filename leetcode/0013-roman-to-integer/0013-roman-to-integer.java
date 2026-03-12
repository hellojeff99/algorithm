class Solution {
    public int romanToInt(String s) {
        int count = 0;
        int right = getNumber(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1) right = getNumber(s.charAt(i + 1));
            int current = getNumber(s.charAt(i));
            if (current < right) {
                count -= current;
            } else {
                count += current;
            }
        }
        return count;
    }

    public static int getNumber(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}