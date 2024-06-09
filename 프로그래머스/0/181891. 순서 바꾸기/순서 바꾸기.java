class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int p=0;
        int p2=n;
        
        for(int i=0;i<num_list.length;i++){
            
            if(p2==num_list.length)
                p2=0;
            answer[p]=num_list[p2];
            p2++;
            p++;
            
            
            
            
            
            
        }
        
        
        return answer;
    }
}