class Solution {
    public String solution(String code) {
        String answer = "";
        int mode=0;
        
        for(int i=0;i<code.length();i++){
            char c=code.charAt(i);
            if(mode==0 && c=='1' ){
                mode=1;

                
                
            } else if(mode==1 && c=='1'){
                mode=0;
            
            } else if(mode==0 && i%2==0){
                answer+=c;
              
                
            } else if(mode==1 && i%2!=0){
                answer+=c;
             
                
            } 
        }
        
        if(answer=="")
            answer="EMPTY";
        
        
        
        
        return answer;
    }
}