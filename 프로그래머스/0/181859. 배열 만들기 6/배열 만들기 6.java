import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> intList = new ArrayList<>();
        int i =0;
        
        while(i<arr.length){
            if(intList.isEmpty()){
                intList.add(arr[i]);
                i++;
                
            } else if (intList.get(intList.size()-1)==arr[i]){
                intList.remove(intList.size()-1);
                i++;
            } else {
                    intList.add(arr[i]);
                i++;
                
            } 
            
            

            
            
        }
        
        answer=new int[intList.size()];
        
        for(int j=0;j<answer.length;j++){
            answer[j]=intList.get(j);
        }
        
        if(intList.isEmpty()){
            return new int[]{-1};
        }

        
        return answer;
    }
}