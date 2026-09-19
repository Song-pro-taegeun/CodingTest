import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        Map<String, Integer> data = new HashMap<>();
        
        for(int i = 0; i < yearning.length; i++){
            data.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length ; i++){
            Integer sum = 0;
            for(String p : photo[i]){
                sum += data.get(p) != null ? data.get(p) : 0;
            }
            result[i] = (int) sum;
        }
        
        
        
        return result;
    }
}