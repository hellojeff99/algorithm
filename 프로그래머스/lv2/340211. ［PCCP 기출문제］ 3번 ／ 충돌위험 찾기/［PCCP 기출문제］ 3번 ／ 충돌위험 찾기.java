import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        List<Map<Integer, Integer>> timeList = new ArrayList<>();
        
        for (int[] route: routes) {
            int[] place = points[route[0] - 1];
            int r = place[0];
            int c = place[1];
            int t = 0;
            int firstNum = r * 1000 + c;    
            if (timeList.size() == 0) {
                timeList.add(new HashMap<Integer, Integer>());
            }
            timeList.get(0).put(firstNum, timeList.get(0).getOrDefault(firstNum, 0) + 1);
            t++;
            for (int i = 1; i < route.length; i++) {
                int[] nextPlace = points[route[i] - 1];
                int nr = nextPlace[0];
                int nc = nextPlace[1];
                while (r != nr) {
                    r += r > nr ? -1 : 1;
                    if (timeList.size() == t) {
                        timeList.add(new HashMap<Integer, Integer>());
                    }
                    Map<Integer, Integer> map = timeList.get(t);
                    int num = r * 1000 + c;
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    t++;
                }
                while (c != nc) {
                    c += c > nc ? -1 : 1;
                    if (timeList.size() == t) {
                        timeList.add(new HashMap<Integer, Integer>());
                    }
                    Map<Integer, Integer> map = timeList.get(t);
                    int num = r * 1000 + c;
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    t++;
                }
            }
        }
        
        for (Map<Integer, Integer> map: timeList) {
            for (int count: map.values()) {
                if (count > 1) answer++;
            }
        }
        return answer;
    }
}