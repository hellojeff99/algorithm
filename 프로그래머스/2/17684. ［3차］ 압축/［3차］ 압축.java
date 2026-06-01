import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        // 사전 만들기
        Map<String, Integer> map = new HashMap<>();
        char c = 'A';
        for (int i = 1; i <= 26; i++) map.put(String.valueOf((char) c++), i);
        
        // 새로운 문자열 삽입을 위한 사전 마지막 인덱스
        int lastIdx = 27;
        
        // 압축 알고리즘
        int idx = 0;
        while (idx < msg.length()) {
            String word = String.valueOf(msg.charAt(idx));
            // 존재하지 않는 단어 찾기
            int nextIdx = idx + 1;
            while (nextIdx < msg.length() && 
                   map.containsKey(word + msg.charAt(nextIdx))) {
                word += msg.charAt(nextIdx);
                nextIdx++;
            }
            
            // 존재하지 않는 단어 사전 입력
            if (nextIdx < msg.length()) map.put(word + msg.charAt(nextIdx), 
                                                lastIdx++);
            
            // 존재하는 단어 결과 출력
            list.add(map.get(word));
            
            // 다음 인덱스
            idx = nextIdx;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}