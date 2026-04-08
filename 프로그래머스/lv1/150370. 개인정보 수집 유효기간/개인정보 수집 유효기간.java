import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        for (String t: terms) {
            String[] tarr = t.split(" ");
            String type = tarr[0];
            int months = Integer.parseInt(tarr[1]);
            map.put(type, months);
        }
        
        int currentDate = getDate(today);
        
        for (int i = 0; i < privacies.length; i++) {
            int num = i + 1;
            
            String p = privacies[i];
            String[] parr = p.split(" ");
            int startDate = getDate(parr[0]);
            String type = parr[1];
            
            int endDate = startDate + map.get(type)*28;
            
            if (currentDate >= endDate) list.add(num);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }
    
    private int getDate(String date) {
        String[] arr = date.split("\\.");
        int yyyy = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        int dd = Integer.parseInt(arr[2]);
        mm = (yyyy - 2000)*12 + mm;
        dd = (mm - 1)*28 + dd;
        return dd;
    }
}