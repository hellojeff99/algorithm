class Solution {
    public int solution(String word) {
		int result = 0;
        int[] num = new int[]{781, 156, 31, 6, 1};
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            switch (c) {
                case 'A': result += 1;
                    break;
                case 'E': result += num[i] + 1;
                    break;
                case 'I': result += num[i]*2 + 1;
                    break;
                case 'O': result += num[i]*3 + 1;
                    break;
                case 'U': result += num[i]*4 + 1;
                    break;
            }
        }
        return result;
    }
}