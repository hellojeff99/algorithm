import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Map<String, Integer> amap = new HashMap<>();
        Map<String, Integer> bmap = new HashMap<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            String word = getWord(str1.substring(i, i + 2));
            System.out.printf("[%s]", word);
            if (word.length() > 0) amap.merge(word, 1, Integer::sum);
        }
        System.out.println();
        for (int i = 0; i < str2.length() - 1; i++) {
            String word = getWord(str2.substring(i, i + 2));
            System.out.printf("[%s]", word);
            if (word.length() > 0) bmap.merge(word, 1, Integer::sum);
        }
        
        int inter = 0;
        int union = 0;
        for (Map.Entry<String, Integer> entry: amap.entrySet()) {
            String key = entry.getKey();
            int acount = amap.get(key);
            int bcount = bmap.getOrDefault(key, 0);
            int count = Math.min(acount, bcount);
            if (count > 0) {
                amap.merge(key, -1*count, Integer::sum);
                bmap.merge(key, -1*count, Integer::sum);
                inter += count;
                union += count;
            }
            int prod = acount - count;
            if (prod > 0) {
                amap.merge(key, -1*prod, Integer::sum);
                union += prod;
            }
        }
        for (Map.Entry<String, Integer> entry: bmap.entrySet()) {
            String key = entry.getKey();
            int count = bmap.get(key);
            if (count > 0) {
                union += count;
                bmap.merge(key, -1*count, Integer::sum);
            }
        }
        System.out.println();
        System.out.println(inter);
        System.out.println(union);
        double result = 0.0;
        if (union > 0) result = (double) inter/union*65536;
        else result = 65536.0;
        return (int) result;
        
    }
    private String getWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            if (Character.isAlphabetic(str.charAt(i))) sb.append(str.charAt(i));
        }
        return sb.toString().length() == 2 ? sb.toString() : "";
    }
}