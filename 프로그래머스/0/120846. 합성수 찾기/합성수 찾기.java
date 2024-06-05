class Solution {
    public int solution(int n) {
        int answer = 0;
        int ch =0;
        
        for(int i=1;i<n+1;i++){
            ch=0;
            for(int j=1;j<i+1;j++){
                if(i%j==0){
                    ch++;
                }
                
            }
            if(ch>2){
                answer++;
}
        }
        
        
        return answer;
    }
}