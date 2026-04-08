class Solution {
    public String solution(int a, int b) {
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int idx = 5;
        for (int i = 1; i < a; i++) idx += days[i];
        idx += b; 
        idx--;
        
        return weeks[idx % 7];
    }
}