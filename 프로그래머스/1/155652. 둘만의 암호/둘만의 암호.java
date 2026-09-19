class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (char c : s.toCharArray()){
            int count = 0;        
            while(count < index){
                c++;
                
                if (c > 'z') c = 'a';
                
                // 스킵에 존재하지 않으면 카운트 증가
                if(skip.indexOf(c)== -1){
                    count ++;
                }
            }            
            answer += c;   
        }
        return answer;
    }
}