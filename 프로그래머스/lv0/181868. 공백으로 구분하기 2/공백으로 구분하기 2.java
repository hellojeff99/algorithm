import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] strArr = my_string.split(" ");
        for (String str : strArr) {
            if (str.length() > 0) list.add(str);
        }
        return list.toArray(new String[0]);
    }
}