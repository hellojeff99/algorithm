class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] checked = new boolean[my_string.length()];
        for (int idx : indices) checked[idx] = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!checked[i]) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}