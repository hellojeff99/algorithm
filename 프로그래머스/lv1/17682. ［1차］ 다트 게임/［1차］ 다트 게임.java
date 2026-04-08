class Solution {
    public int solution(String dartResult) {
        int current = 0;;
        int prev = 0;
        int result = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c == '1' && dartResult.charAt(i + 1) == '0') {
                i++;
                result += prev;
                prev = current;
                current = 10;
            } else if (Character.isDigit(c)) {
                result += prev;
                prev = current;
                current = Character.getNumericValue(c);
            } else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'D') current *= current;
                else if (c == 'T') current *= current * current;
            } else if (c == '*' || c == '#') {
                if (c == '*') {
                    prev *= 2;
                    current *= 2;
                } else if (c == '#') {
                    current *= -1;
                }
            }
        }
        return result + prev + current;
    }
}