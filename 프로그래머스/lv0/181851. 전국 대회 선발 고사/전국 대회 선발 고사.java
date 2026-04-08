import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] == false) continue;
            list.add(new int[]{i, rank[i]});
        }
        list.sort(Comparator.comparingInt(a -> a[1]));
        int a = list.get(0)[0];
        int b = list.get(1)[0];
        int c = list.get(2)[0];
        return 10000*a+100*b+c;
    }
}