import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i =0; i<arr.length;i++){
            if(arr[i]>=50 && arr[i]%2==0){
                arr[i]=arr[i]/2;
            } else if(arr[i]<50 && arr[i]%2==1){
                arr[i]=arr[i]*2;
            }
        }
        
        answer= Arrays.copyOfRange(arr,0,arr.length);
        
        
        
        return answer;
    }
}