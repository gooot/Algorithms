class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        int p=0;
        
        
        for(int i=start;i>end_num-1;i--){
            answer[p]=i;
            p++;
        }
        
        
        return answer;
    }
}