import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."};
        String[] strArr = letter.split(" ");
        
        for(int i=0;i<strArr.length;i++){
            for(int j=0;j<morse.length;j++){ 
                if(strArr[i].equals(morse[j])){
                    answer+= Character.toString(j+'a');
                }
                
            }
        }
        
        
        
        return answer;
    }
}