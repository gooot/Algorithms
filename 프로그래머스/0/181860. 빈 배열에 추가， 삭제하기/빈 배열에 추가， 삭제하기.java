import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> intList = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(flag[i]==true){
                for(int j=0;j<arr[i]*2;j++){
                intList.add(arr[i]);
                }
                
            } else {
                for(int j=0;j<arr[i];j++){
                intList.remove(intList.size()-1);
                }
            }
        }
        answer=new int[intList.size()];
        for(int i=0;i<intList.size();i++){
            answer[i]=intList.get(i);
        }
        
        
        
        
        
        return answer;
    }
}