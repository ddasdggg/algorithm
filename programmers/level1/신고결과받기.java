import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];

        HashMap<String, HashSet<String>> mapReport = new HashMap<>();
        HashMap<String, Integer> mapReportedCnt = new HashMap<>();
        HashSet<String> setReport = new HashSet<>(Arrays.asList(report));

        for (String reporter : id_list) {
            HashSet reported = new HashSet();
            mapReport.put(reporter, reported);
        }

        for (String reportInfo : setReport) {
            String reporter = reportInfo.split(" ")[0];
            String reported = reportInfo.split(" ")[1];
            mapReport.get(reporter).add(reported);
            mapReportedCnt.put(reported,mapReportedCnt.getOrDefault(reported, 0) + 1);
        }

        for (String reported : mapReportedCnt.keySet()) {
            int reportedCnt = mapReportedCnt.get(reported);
            if (reportedCnt >= k) {
                for (int i = 0; i < id_list.length; i ++) {
                    if (mapReport.get(id_list[i]).contains(reported)) {
                        answer[i] ++;
                    }
                }
            }
        }

        return answer;
    }
}