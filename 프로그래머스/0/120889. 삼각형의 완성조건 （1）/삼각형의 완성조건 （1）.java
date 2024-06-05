class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int top=0;
        int temp=0;
        
        for(int i=0;i<sides.length;i++){
            if(top<sides[i])
                top=sides[i];
            
        }
        
        for(int i=0;i<sides.length;i++){
            if(top==sides[i] &&i!=2){
                temp=sides[2];
                sides[2]=top;
                sides[i]=temp;
                break;
                
            }
        }
        
        if((sides[0]+sides[1]>sides[2])){
            answer=1;
        } else {
            answer=2;
        }
        
            
        
        
        
        return answer;
    }
}