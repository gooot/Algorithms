import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string=my_string.toLowerCase();
        
        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);
        
        answer=new String(chArr);
        
        
        return answer;
    }
}