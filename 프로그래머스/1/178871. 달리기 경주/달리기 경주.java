import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> data = new HashMap<>();
        
        for (int i = 0; i < players.length; i++){
            data.put(players[i], i);
        }
        
        for (String str: callings){
            int idx = data.get(str);
            
            if(idx == 0) continue;
            String findUpdateName = players[idx-1];
            
            data.put(str, idx-1);
            data.put(findUpdateName, idx);
            
            players[idx - 1] = str;
            players[idx] = findUpdateName;
        }
        
        
        
        return players;
    }
}