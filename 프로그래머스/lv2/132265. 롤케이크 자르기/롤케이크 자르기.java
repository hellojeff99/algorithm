import java.util.*;
class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> amap = new HashMap<>();
        Map<Integer, Integer> bmap = new HashMap<>();
        
        for (int i = 0; i < topping.length; i++) bmap.put(topping[i], bmap.getOrDefault(topping[i], 0) + 1);
        
        int result = 0;
        for (int i = 0; i < topping.length; i++) {
            if (bmap.get(topping[i]) > 1) {
                bmap.put(topping[i], bmap.get(topping[i]) - 1);
            } else {
                bmap.remove(topping[i]);
            }
            amap.put(topping[i], amap.getOrDefault(topping[i], 0) + 1);
            
            if (amap.size() == bmap.size()) result++;
        }
        
        return result;
        
    }
}