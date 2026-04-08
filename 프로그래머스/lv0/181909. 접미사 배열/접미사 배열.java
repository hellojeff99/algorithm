import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}