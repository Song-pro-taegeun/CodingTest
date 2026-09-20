import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 신고 한유저가 key, 당한 유저가 value
        Map<String, Set<String>> map = new HashMap<>();
        
        // 신고당한 유저 카운팅 맵
        Map<String, Integer> reportedUser = new HashMap<>();
        
        for(String str: report){
            String to = str.split(" ")[0];
            String from = str.split(" ")[1];
            
            // 처음 신고당한 유저라면 빈 Set 생성
            if (!map.containsKey(to)) {
                map.put(to, new HashSet<>());
            }
            
            map.get(to).add(from);
        }
        
        
        // 신고당한 유저 맵에 카운트
        for(String id: id_list){
            Set<String> datas = map.get(id);
            if(datas == null) continue;
            
            for(String user: datas){
                int sumCount = reportedUser.getOrDefault(user, 0);
                reportedUser.put(user, sumCount + 1);
            }
        }
        
        // 메일 발송 배열 저장
        for(int i = 0; i < id_list.length; i++){
            Set<String> datas = map.get(id_list[i]);
            if(datas == null) {
                answer[i] = 0;
                continue;
            }
            
            for(String user: datas){
                int count = reportedUser.getOrDefault(user, 0);
                if (count >= k) answer[i] += 1;
            }
        }
        
                
        return answer;
    }
}