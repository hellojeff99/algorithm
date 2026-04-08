import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) map.put(name[i], yearning[i]);
        
        int[] result = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int point = 0;
            for (String person: photo[i]) {
                if (map.containsKey(person)) point += map.get(person);
            }
            result[i] = point;
        }
        return result;
    }
}