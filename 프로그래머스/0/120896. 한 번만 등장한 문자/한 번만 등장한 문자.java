import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int n=0;
        Arrays.sort(strArr);
        
        for(int i=0;i<strArr.length;i++){
            n=0;
            
            for(int j=0;j<strArr.length;j++){
                if(strArr[i].equals(strArr[j])){
                    n++;
                } 
            }
            
            if(n==1){
                answer+=strArr[i];
            }
        
        }
        
        
        
        return answer;
    }
}