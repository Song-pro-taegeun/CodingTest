class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // query 범위 내 인덱스 위치 배수에 +1 하는 문제
        int[] result = arr;
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];
            
            
            for(int j = start; j <= end; j++){
                if(j % value == 0){
                    result[j] = result[j] + 1;
                }
            }
        }
        
        return result;
    }
}