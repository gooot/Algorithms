class Solution {
    public int[] solution(int n, int[] numlist) {
        int c=0;
        int j=0;
        
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0)
                c++;
        }
    
        
        int[] answer = new int[c];
        
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[j] = numlist[i];
                j++;
            }
                
            
        }
        
        
        
        
        return answer;
    }
}