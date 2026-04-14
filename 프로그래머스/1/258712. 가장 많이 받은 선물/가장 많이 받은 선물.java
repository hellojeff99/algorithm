import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, int[]> gift_point_map = new HashMap<>();
        Map<String, Map<String, Integer>> give_receive_map = new HashMap<>();
        for (String f: friends) {
            gift_point_map.put(f, new int[]{0, 0});
            give_receive_map.put(f, new HashMap<>());
        }
        for (String g: gifts) {
            String[] arr = g.split(" ");
            give_receive_map.get(arr[0]).merge(arr[1], 1, Integer::sum);
            int[] giver = gift_point_map.get(arr[0]);
            int[] receiver = gift_point_map.get(arr[1]);
            giver[0]++;
            receiver[1]++;
            gift_point_map.put(arr[0], giver);
            gift_point_map.put(arr[1], receiver);
        }
        Map<String, Integer> predict = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            for (int j = i+1; j < friends.length; j++) {
                String f1 = friends[i];
                String f2 = friends[j];
                int f1_to_f2 = give_receive_map.get(f1).getOrDefault(f2, 0);
                int f2_to_f1 = give_receive_map.get(f2).getOrDefault(f1, 0);
                if (f1_to_f2 > f2_to_f1) {
                    predict.merge(f1, 1, Integer::sum);
                } else if (f1_to_f2 < f2_to_f1) {
                    predict.merge(f2, 1, Integer::sum);
                } else {
                    int f1_point = gift_point_map.get(f1)[0] - gift_point_map.get(f1)[1];
                    int f2_point = gift_point_map.get(f2)[0] - gift_point_map.get(f2)[1]; 
                    if (f1_point > f2_point) {
                        predict.merge(f1, 1, Integer::sum);
                    } else if (f1_point < f2_point) {
                        predict.merge(f2, 1, Integer::sum);
                    }
				}
            }
        }
        int result = -1;
        for (String f: friends) {
            result = Math.max(predict.getOrDefault(f, 0), result);
        }
        return result;
    }
}