import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> tmp = new ArrayList();
        tmp.add(n);
        
        int i = n;
        while(i != 1){
            // 짝수
            if(i % 2 == 0){
                i = i / 2;
            } else {
                i = 3 * i + 1;
            }
            tmp.add(i);
        }
        
        
        
        
        return tmp.stream().mapToInt(Integer::intValue).toArray();
    }
}