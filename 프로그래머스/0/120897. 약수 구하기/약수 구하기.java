class Solution {
    public int[] solution(int n) {
        
        int c=0;
        int j=0;
        
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                c++;
}
        }
        
        int[] answer = new int[c];
        
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                answer[j] += i;
                j++;
}
        }
        
        
        
        
        
        
        
        
        return answer;
    }
}