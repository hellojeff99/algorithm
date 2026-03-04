class Solution {
    private static int[] number;
    private static boolean[] isChecked;
    private static int result = 0;
    
    public int solution(int[] number) {
        this.number = number;
        isChecked = new boolean[number.length];
        backtrack(0, 0, 0);
        return result;
    }
    private void backtrack(int count, int sum, int idx) {
        if (count == 3) {
            if (sum == 0) result++;
            return;
        }
        for (int i = idx; i < number.length; i++) {
            if (isChecked[i] == true) continue;
            
            sum += number[i];
            isChecked[i] = true;
            count++;
            
            backtrack(count, sum, i + 1);
            
            sum -= number[i];
            isChecked[i] = false;
            count--;
        }
    }
    
}