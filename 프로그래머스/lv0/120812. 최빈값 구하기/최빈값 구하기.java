import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
       	for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (count < map.get(i)) {
                count = map.get(i);
                answer = i;
            }
            else if (count == map.get(i)) answer = -1;
        }
        return answer;
    }
}