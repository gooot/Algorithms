import java.util.*;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int a=0;
        int b=0;
        String op = "";
        
        String[] strArr = binomial.split(" ");
        op = strArr[1];
        a = Integer.parseInt(strArr[0]);
        b = Integer.parseInt(strArr[2]);
        
        
        if(op.equals("+")){
            answer = a+b;
        }
        
        if(op.equals("-")){
            answer = a-b;
        }
        
        if(op.equals("*")){
            answer = a*b;
        }
        
        
        
        return answer ;
    }
}