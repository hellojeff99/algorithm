import java.util.*;
class Solution {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        // r: 0~10, c: 0~10
        int current = 505;
        int result = 0;
        for (char d: dirs.toCharArray()) {
            int next = current;
            int r = current/100;
            int c = current%100;
            if (d == 'U') {
                if (r < 10) next += 100;
                else continue;
            } else if (d == 'D') {
                if (r > 0) next -= 100;
                else continue;
            } else if (d == 'L') {
                if (c > 0) next -= 1;
                else continue;
            } else if (d == 'R') {
                if (c < 10) next += 1;
                else continue;
            }
            String direction = String.format("%d%d", current, next);
            if (!set.contains(direction)) {
                String reverse = String.format("%d%d", next, current);
                set.add(direction);
                set.add(reverse);
                result++;
            }
            current = next;
        }
        return result;
    }
}