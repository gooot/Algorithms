import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger bi = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        
        
        
        answer= bi.add(bi2).toString();
        
        
        
        return answer;
    }
}