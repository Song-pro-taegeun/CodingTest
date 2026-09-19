import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> a = new ArrayList();
        
        for(int i = l; i <= r; i++){
            String str = String.valueOf(i); // 숫자를 문자열로 변환
            boolean valid = true;
            
            
            for(char c: str.toCharArray()){
                if(c != '0' && c != '5'){
                    valid = false;
                    break;
                }
            }
            
            if(valid){
                a.add(Integer.parseInt(str));                
            }
        }
        
        if(a.size() == 0){
            a.add(-1);
        }
        
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}