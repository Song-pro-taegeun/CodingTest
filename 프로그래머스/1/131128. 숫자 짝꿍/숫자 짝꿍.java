import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        List<Integer> numArr = new ArrayList();
        
        // 인덱스를 기준으로 밸류 증가
        int[] yCount = new int[10];
        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }
        
        for (char c : X.toCharArray()) {
            int num = c - '0';
            
            // yCount가 남아있을 때만 실행
            if (yCount[num] > 0) {
                numArr.add(num);
                
                // 하나 사용했으니 남은 개수 감소
                yCount[num]--; 
            }
        }
        
        // 매칭되는 항목이 없을 때
        if(numArr.size() == 0){
            sb.setLength(0);
            sb.append("-1");
        }
        
        // 오름차순 정렬
        numArr.sort(Collections.reverseOrder());
        for(Integer num: numArr){
            sb.append(num);    
        }
        
        // 0부터 시작하는 결과 값
        // if(answer.startsWith("0")){
        if(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.setLength(0);
            sb.append("0");   
        }
        
        return sb.toString();
    }
}