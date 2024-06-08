import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        int[] int1 = Arrays.copyOfRange(arr,intervals[0][0],intervals[0][1]+1);
        int[] int2 = Arrays.copyOfRange(arr,intervals[1][0],intervals[1][1]+1);
        
        answer=new int[int1.length+int2.length];
        
        for(int i=0;i<int1.length+int2.length;i++){
            if(i<int1.length){
                answer[i]=int1[i];
                
            } else {
                answer[i]=int2[i-int1.length];
            }
            
        }
        
        
        
        
        
        return answer;
    }
}