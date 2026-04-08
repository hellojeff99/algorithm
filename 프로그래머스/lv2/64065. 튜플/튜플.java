import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] arr = s.split("\\}\\,\\{");
        List<Integer>[] listArr = new ArrayList[arr.length];
        for (int i = 0; i < listArr.length; i++) {
            listArr[i] = new ArrayList<>();
            for (String str: arr[i].split(",")) {
                listArr[i].add(Integer.parseInt(str));
            }
        }
        Arrays.sort(listArr, (a, b) -> a.size() - b.size());
        Set<Integer> set = new HashSet<>();
        int[] result = new int[listArr.length];
        for (int i = 0; i < listArr.length; i++) {
            for (int num: listArr[i]) {
                if (set.contains(num)) continue;
                set.add(num);
                result[i] = num;
            }
        }
        return result;
    }
}