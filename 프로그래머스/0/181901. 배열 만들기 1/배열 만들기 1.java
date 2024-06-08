class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int c =0;
        
        for(int i=1;i<n+1;i++){
            if(i%k==0){
                c++;
            }
        }
        
        answer= new int[c];
        c=0;
        for(int i=1;i<n+1;i++){
            if(i%k==0){
                answer[c]=i;
                c++;
            }
        }
        
        return answer;
    }
}