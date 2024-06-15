class Solution {
    public int solution(int n) {
        int answer = 0;
        int num=1;
        int value=0;
        
        while(true){
            
            value=fac(num);
            
            if(value>n){
                answer=num-1;
                break;
            }
            
            
            num++;
        }
        
        
        return answer;
    }
    
    public int fac(int n){
        int temp=1;
        
        for(int i=1;i<n+1;i++){
            temp*=i;
        }
        
        return temp;
    }
}