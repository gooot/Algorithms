class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int t=0;
        
        for(int i=0;i<num_list.length;i++){
            answer*=num_list[i];
            t+=num_list[i];
        }
        t=(int)Math.pow(t,2);
        if(answer>t)
            answer=0;
        else 
            answer=1;
        
        
        return answer;
    }
}