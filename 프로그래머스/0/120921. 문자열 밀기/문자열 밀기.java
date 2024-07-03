class Solution {
    public int solution(String A, String B) {
        int answer = 0;       
        String str="";
        
        for(int i=0;i<A.length();i++){
            if(A.equals(B)){
                answer=i;
                break;
            }
            
            str=A.substring(A.length()-1);
            A=str+A.substring(0,A.length()-1);
            answer++;
            
            
        }
        
        if(answer==A.length()){
            answer=-1;
        }
        
        
        
        return answer;
    }
}