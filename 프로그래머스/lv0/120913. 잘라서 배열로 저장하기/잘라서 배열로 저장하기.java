class Solution {
    public String[] solution(String my_str, int n) {
        String[] arr = new String[(my_str.length() - 1) / n + 1];
        for (int i = 0; i < my_str.length(); i += n) {
            if (i + n > my_str.length()) arr[i / n] = my_str.substring(i);
            else arr[i / n] = my_str.substring(i, i + n);
        }
        return arr;
    }
}