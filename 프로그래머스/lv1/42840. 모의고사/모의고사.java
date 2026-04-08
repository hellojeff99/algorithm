import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] students = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) students[0]++;
            if (answers[i] == b[i % b.length]) students[1]++;
            if (answers[i] == c[i % c.length]) students[2]++;
        }
        int max = Math.max(students[0], Math.max(students[1], students[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 3; i++) {
            if (students[i] == max) list.add(i + 1);
        }
        return list.stream().mapToInt(i -> i).toArray();
        
        
    }
}