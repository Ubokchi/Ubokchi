import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        Set<String> uniqueReports = new HashSet<>();
        for (String r : report) {
            uniqueReports.add(r);
        }

        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> reportedCount = new HashMap<>();

        for (String r : uniqueReports) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            reportMap.computeIfAbsent(reporter, key -> new HashSet<>()).add(reported);
            reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
        }

        Set<String> banned = new HashSet<>();
        for (String user : reportedCount.keySet()) {
            if (reportedCount.get(user) >= k) {
                banned.add(user);
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            int cnt = 0;

            if (reportMap.containsKey(user)) {
                for (String reported : reportMap.get(user)) {
                    if (banned.contains(reported)) {
                        cnt++;
                    }
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}