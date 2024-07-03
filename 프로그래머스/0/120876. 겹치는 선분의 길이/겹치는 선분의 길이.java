import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int low=0;
        int high=0;
        int length=0;
        
        int[] spotArr;
        
        for(int i=0;i<lines.length;i++){
            if(lines[i][0]<low){
                low=lines[i][0];
            }
            if(lines[i][1]>high){
                high=lines[i][1];
            }
        }
        
        length=Math.abs(low)+Math.abs(high);
        spotArr=new int[length];
        
        for(int i=0;i<length;i++){
            if(lines[0][0]<=low+i && low+i<lines[0][1]){ 
                spotArr[i]++;
            }
            if(lines[1][0]<=low+i && low+i<lines[1][1]){ 
                spotArr[i]++;
            }
            if(lines[2][0]<=low+i && low+i<lines[2][1]){ 
                spotArr[i]++;
            }
        }
        
        for(int i=0;i<spotArr.length;i++){ 
            if(spotArr[i]>1){
                answer++;
            }
        }
        
        
        return answer;
    }
}