class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArray = my_string.split(" ");
        
        for(int i=0;i<strArray.length;i++){
            if(i==0){
                answer+=Integer.parseInt(strArray[0]);
            }
            
           if(strArray[i].equals("+")){
               answer+= Integer.parseInt(strArray[i+1]);
           }
            if(strArray[i].equals("-")){
               answer-= Integer.parseInt(strArray[i+1]);
           }
        
            
        }
        
        return answer;
    }
}