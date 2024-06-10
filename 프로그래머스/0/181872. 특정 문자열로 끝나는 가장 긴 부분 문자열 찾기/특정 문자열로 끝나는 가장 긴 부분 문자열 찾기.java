class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i=myString.length();i>0;i--){
            String chk="";
            chk=myString.substring(i-pat.length(),i);
            
            if(chk.equals(pat)){
                answer=myString.substring(0,i);
                break;
            }
        }
        
        return answer;
    }
}