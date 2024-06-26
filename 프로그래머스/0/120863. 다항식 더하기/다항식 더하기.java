class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x=0;
        int num=0;
        
        String[] strArr = polynomial.split(" ");
     
        
        for(int i=0;i<strArr.length;i++){
            
            System.out.println(strArr[i]);

            if(i%2==0){
                if(strArr[i].contains("x")){
                    if(strArr[i].length()==1 ){
                        x++;
                        
                    } else {
                        x+=Integer.parseInt(strArr[i].substring(0,strArr[i].length()-1));
                    }
                    
                } else {
                    num+=Integer.parseInt(strArr[i]);
                    
                }
                
                
                
            }
            
            
        }
        
        
        if(x==0 && num!=0){
            answer=String.valueOf(num);
        } else if(x!=0 && num==0){ 
            if(x==1){
                answer="x";
            } else {
                answer=x+"x";
            }
            
        } else if(x!=0 && num!=0){
            if(x==1){
                answer = "x + "+num;
            } else {
                answer = x+"x + "+num;
            }
            
        } 
      
        
        
        
        return answer;
    }
}