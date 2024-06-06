class Solution {
    public int solution(int a, int b) {
        int answer1 = 0;
        int answer2 = 0;
        
        answer1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        answer2 = 2*a*b;
        
        if(answer1==answer2)
            return answer1;
        else if(answer1>answer2){
            return answer1;
            
        } else {
            return answer2;
        }
         
        
      
        
    }
}