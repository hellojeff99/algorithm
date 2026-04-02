class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (char c: targets[i].toCharArray()) {
                String str = String.valueOf(c);
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < keymap.length; j++) {
                    if (keymap[j].contains(str)) {
                        min = Math.min(min, keymap[j].indexOf(str) + 1);
                    }
                }
                if (min == Integer.MAX_VALUE) {
                    count = -1;
                    break;
                }
                else count += min;
            }
            result[i] = count;
        }
        return result;
    }
}