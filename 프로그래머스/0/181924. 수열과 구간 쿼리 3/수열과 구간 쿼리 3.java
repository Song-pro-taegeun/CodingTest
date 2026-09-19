class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for(int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            
            int prev = answer[a];
            int next = answer[b];
            
            answer[a] = next;
            answer[b] = prev;
        }
        return answer;
    }
}