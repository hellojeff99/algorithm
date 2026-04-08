class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] arr = new boolean[26];
        for (char c: skip.toCharArray()) arr[c - 'a'] = true;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            int count = 0;
            while (count < index) {
               	idx = (idx + 1) % 26; 
                if (arr[idx] == false) count++;
            }
            sb.setCharAt(i, (char) (idx + 'a'));
        }
        return sb.toString();
    }
}