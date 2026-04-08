import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> rankMap = new HashMap<>();
        Map<String, List<int[]>> songMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            rankMap.merge(genres[i], plays[i], Integer::sum);
            songMap.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{i, plays[i]});
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(rankMap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entity: list) {
            String title = entity.getKey();
            List<int[]> songList = songMap.get(title);
            songList.sort((a, b) -> {
                if (a[1] == b[1]) return a[0] - b[0];
                else return b[1] - a[1];
            });
            int count = 0;
            for (int[] song: songList) {
                result.add(song[0]);
                count++;
                if (count >= 2) break;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
        
    }
}