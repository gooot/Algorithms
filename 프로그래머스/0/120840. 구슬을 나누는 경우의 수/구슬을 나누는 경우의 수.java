import java.math.BigInteger;                                      
class Solution {
  public BigInteger solution(int balls, int share) {
        
        return fac(balls).divide((fac(balls-share).multiply(fac(share)))); 
    }
    
    public BigInteger fac(int num) {                              
        BigInteger big=new BigInteger("1");                       
        for(int i=1; i<=num; i++) {
            big=big.multiply(new BigInteger(Integer.toString(i)));
        }
        return big;
    }
 
}
