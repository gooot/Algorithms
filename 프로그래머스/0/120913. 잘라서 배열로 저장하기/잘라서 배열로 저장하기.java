class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        if(my_str.length()%n==0){
            answer= new String[my_str.length()/n];
        } else {
            answer= new String[my_str.length()/n+1];
        }
        
        int count=1;
        
        for(int i=0;i<answer.length;i++){
            if(i==0){
                answer[i]= my_str.substring(0,n);
                
            } else if(n*(i+1)>=my_str.length()) {
                answer[i]=my_str.substring(n*i,my_str.length());
                
            } else {
                answer[i]=my_str.substring(n*i,n*(i+1));
                
            }
            
        }
        
        
        
        return answer;
    }
}