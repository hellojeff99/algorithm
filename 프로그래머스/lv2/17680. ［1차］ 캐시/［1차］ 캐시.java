import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return 5 * cities.length;
        Map<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };
        int time = 0;
        for (int i = 0; i < cities.length; i++) {
            if (map.containsKey(cities[i].toLowerCase())) time++;
            else time += 5;
            map.put(cities[i].toLowerCase(), i);
        }
        return time;
    }
}