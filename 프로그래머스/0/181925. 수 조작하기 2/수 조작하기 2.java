class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 0; i < numLog.length; i++){
            if(i != 0){
                int diff = numLog[i] - numLog[i - 1];
                
                switch(diff){
                    case 1:
                        answer = answer + "w";
                        break;
                    case -1:
                        answer = answer + "s";
                        break;
                    case 10:
                        answer = answer + "d";
                        break;
                    case -10:
                        answer = answer + "a";
                        break;
                        
                }
            }
        }
        return answer;
    }
}