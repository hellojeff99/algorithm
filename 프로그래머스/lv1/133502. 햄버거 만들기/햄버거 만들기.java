import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int[] burger = new int[ingredient.length];
        int top = 0;
        int result = 0;
        for (int i: ingredient) {
            burger[top] = i;
            if (top >= 3) {
                if (burger[top] == 1 &&
                   burger[top - 1] == 3 &&
                   burger[top - 2] == 2 &&
                   burger[top - 3] == 1) {
                   result++;
                   top -= 4;
                }
            }
            top++;
        }
        return result;
    }
}