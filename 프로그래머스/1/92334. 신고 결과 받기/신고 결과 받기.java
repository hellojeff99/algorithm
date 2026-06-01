import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> reportedCounts = new HashMap<>();
        for (String r: report) {
            String[] arr = r.split(" ");
            String user = arr[0];
            String target = arr[1];
            Set<String> targetSet = reportMap.computeIfAbsent(user, v -> new HashSet<>());
            if (targetSet.add(target)) {
                reportedCounts.merge(target, 1, Integer::sum);
            }
        }
        
        List<String> suspendedUser = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: reportedCounts.entrySet()) {
            if (entry.getValue() >= k) suspendedUser.add(entry.getKey());
        }
        
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            int count = 0;
            Set<String> reportTargets = reportMap.getOrDefault(id, new HashSet<>());
            if (reportTargets.isEmpty()) {
                result[i] = 0;
                continue;
            }
            for (String suspendedId: suspendedUser) {
                if (reportTargets.contains(suspendedId)) count++;
            }
            result[i] = count;
        }
        return result;
    }
}