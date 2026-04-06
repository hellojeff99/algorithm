import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        
        int e = getIndex(ext);
      	int s = getIndex(sort_by);
        
        for (int[] d: data) {
            if (d[e] < val_ext) list.add(d);
        }
        
        list.sort((a, b) -> a[s] - b[s]);
        return list.toArray(new int[0][]);
    }
    
    private int getIndex(String str) {
        if (str.equals("code")) return 0;
        else if (str.equals("date")) return 1;
        else if (str.equals("maximum")) return 2;
        else if (str.equals("remain")) return 3;
        return -1;
    }
}