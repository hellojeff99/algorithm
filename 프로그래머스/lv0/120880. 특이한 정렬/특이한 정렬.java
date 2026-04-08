import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for (int num: numlist) list.add(num);
        list.sort((a, b) -> {
            int x = Math.abs(n - a);
            int y = Math.abs(n - b);
            if (x == y) return Integer.compare(b, a);
            else return Integer.compare(x, y);
            });
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}