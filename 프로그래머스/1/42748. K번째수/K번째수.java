import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        for(int i=0;i<commands.length;i++){
            answer[i]=doCutting(array,commands[i][0],commands[i][1],commands[i][2]);
        }
        
        
        return answer;
    }
    public int doCutting(int[] arr,int start,int end, int target){
        int[] tempArr= new int[end-start+2];
        int count=0;
        for(int i=start-1;i<end;i++){
            tempArr[count]=arr[i];
            count++;
            
        }
        Arrays.sort(tempArr);
        
        
        
        return tempArr[target];
    }
}