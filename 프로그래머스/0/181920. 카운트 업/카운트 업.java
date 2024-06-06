class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        
        
        
        for(int i=0;i<answer.length;i++){
         
            if(i==0){
                answer[i]=start_num;
                
            } else {
                answer[i] = answer[i-1]+1;
            }
        }
        
        return answer;
    }
}