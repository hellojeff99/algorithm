import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (String o: operations) {
            String[] arr = o.split(" ");
            String op = arr[0];
            int num = Integer.parseInt(arr[1]);
            if (op.equals("I")) {
                map.merge(num, 1, Integer::sum);
            } else if (op.equals("D") && map.size() > 0) {
                int key = 0;
                if (num == 1) key = map.lastKey();
                else key = map.firstKey();
                
                if (map.get(key) == 1) map.remove(key);
                else map.put(key, map.get(key) - 1);
            }
        }
        if (map.size() > 0) return new int[]{map.lastKey(), map.firstKey()};
        else return new int[]{0, 0};
    }
}