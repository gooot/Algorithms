import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str="";
        String t=String.valueOf(k);
        
        for(int st=i;st<j+1;st++){
            str+=String.valueOf(st);
            
        }
        
        String[] strArr;
        strArr=str.split("");
        
        for(int a=0;a<strArr.length;a++){
            if(strArr[a].equals(t))
               answer++;
        }
        
       
        
        
        return answer;
    }
}