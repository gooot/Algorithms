import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[Arrays.copyOfRange(numbers,num1,num2+1).length];
        
        answer = Arrays.copyOfRange(numbers,num1,num2+1);
        
        
        return answer;
    }
}