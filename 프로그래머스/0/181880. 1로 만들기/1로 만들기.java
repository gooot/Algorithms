class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        
        for(int i=0;i<num_list.length;i++){
            
            int t=num_list[i];
            while(t!=1){
                if(t%2==0){
                    t/=2;
                } else {
                    t=(t-1)/2;
                }
                answer++;
                
            }
            
            
        }
        
        
        
        
        
        return answer;
    }
}