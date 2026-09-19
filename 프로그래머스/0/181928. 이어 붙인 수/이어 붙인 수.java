class Solution {
    public int solution(int[] num_list) {
        String x ="";
        String y ="";
        for(int i=0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                y = y + num_list[i];
            } else {
                x = x + num_list[i];
            }
        }
        
        int answer = 0;
        answer = Integer.parseInt(x) + Integer.parseInt(y);
        return answer;
    }
}