import java.util.*;
class Solution {
    public int solution(int N, int number) {
        if (N == number) return 1;
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 9; i++) list.add(new HashSet<>());
        
        for (int i = 1; i <= 9; i++) {
            Set<Integer> set = list.get(i);
            
            int repeatedN = 0;
            for (int j = 0; j < i; j++) repeatedN = repeatedN * 10 + N;
            set.add(repeatedN);
            
            for (int j = 1; j < i; j++) {
                Set<Integer> left = list.get(j);
                Set<Integer> right = list.get(i - j);
                
                for (int l: left) {
                    for (int r: right) {
                        set.add(l + r);
                        set.add(l - r);
                        set.add(l * r);
                        if (r > 0) set.add(l / r);
                    }
                }
                
                if (set.contains(number)) return i;
            }
        }
        return -1;
    }
}